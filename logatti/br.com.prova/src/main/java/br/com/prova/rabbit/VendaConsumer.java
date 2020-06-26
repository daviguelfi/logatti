package br.com.prova.rabbit;

import br.com.prova.model.Venda;
import br.com.prova.service.VendaService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class VendaConsumer {

    @Autowired
    private VendaService vendaService;

    @RabbitListener(queues = {"${queue.venda.name}"})
    public  void receive(@Payload Venda venda) {
        System.out.println("Id: " + venda.getId() + "\nNome: " + venda.getDescricao());
        vendaService.save(venda);
    }
}
