package br.com.projrabbit.rabbit;

import br.com.projrabbit.model.Fornecedor;
import br.com.projrabbit.service.FornecedorService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class FornecedorConsumer {

    @Autowired
    private FornecedorService fornecedorService;

    @RabbitListener(queues = {"${queue.fornecedor.name}"})
    public void receive(@Payload Fornecedor fornecedor) {
        System.out.println("Id: " + fornecedor.getId() + "\nNome: " + fornecedor.getNome());
        fornecedorService.save(fornecedor);
    }
}
