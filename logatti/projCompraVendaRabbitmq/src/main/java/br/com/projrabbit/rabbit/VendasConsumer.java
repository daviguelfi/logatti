package br.com.projrabbit.rabbit;

import br.com.projrabbit.model.Vendas;
import br.com.projrabbit.service.VendasService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class VendasConsumer {
    @Autowired
    private VendasService vendasService;
    @RabbitListener(queues = {"${queue.venda.name}"})
    public void receive(@Payload Vendas vendas) {
        System.out.println("Id: " + vendas.getId() + "\nNome: " + vendas.getDescricao());
        vendasService.save(vendas);
    }

}
