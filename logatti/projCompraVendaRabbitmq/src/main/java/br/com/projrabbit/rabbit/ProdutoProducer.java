package br.com.projrabbit.rabbit;

import br.com.projrabbit.model.Produtos;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProdutoProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Qualifier("produtoQueue")
    @Autowired
    private Queue queue;

    public void send(Produtos produtos) {
        rabbitTemplate.convertAndSend(queue.getName(), produtos);
    }
}
