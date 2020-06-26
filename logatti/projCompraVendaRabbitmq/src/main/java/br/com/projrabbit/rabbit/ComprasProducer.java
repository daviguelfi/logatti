package br.com.projrabbit.rabbit;

import br.com.projrabbit.model.Compras;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComprasProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Qualifier("compraQueue")
    @Autowired
    private Queue queue;

    public void send(Compras compras) {
        rabbitTemplate.convertAndSend(this.queue.getName(), compras);
    }
}
