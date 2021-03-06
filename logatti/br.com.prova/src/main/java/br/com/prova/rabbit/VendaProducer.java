package br.com.prova.rabbit;

import br.com.prova.model.Venda;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VendaProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Qualifier("vendaQueue")
    @Autowired
    private Queue queue;

    public void send(Venda venda) {
        rabbitTemplate.convertAndSend(this.queue.getName(), venda);
    }
}
