package br.com.projrabbit.rabbit;

import br.com.projrabbit.model.Vendas;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VendasProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Qualifier("vendaQueue")
    @Autowired
    private Queue queue;

    public void send(final Vendas vendas) {
        rabbitTemplate.convertAndSend(queue.getName(), vendas);
    }
}
