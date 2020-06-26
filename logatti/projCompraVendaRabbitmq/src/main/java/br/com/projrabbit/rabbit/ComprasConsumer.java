package br.com.projrabbit.rabbit;

import br.com.projrabbit.model.Compras;
import br.com.projrabbit.service.ComprasService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ComprasConsumer {
    @Autowired
    private ComprasService comprasService;

    @RabbitListener(queues = {"${queue.compra.name}"})
    public void receive(@Payload Compras compras) {
        System.out.println("Id: " + compras.getId() + "\nNome: " + compras.getDescricao());
        comprasService.save(compras);
    }
}
