package br.com.projrabbit.rabbit;

import br.com.projrabbit.model.Produtos;
import br.com.projrabbit.service.ProdutosService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ProdutoConsumer {

    @Autowired
    private ProdutosService produtosService;

    @RabbitListener(queues = {"${queue.produto.name}"})
    public void receive(@Payload Produtos produtos) {
        System.out.println("Id: " + produtos.getId() + "\nNome: " + produtos.getNome());
        produtosService.save(produtos);
    }
}
