package br.com.projrabbit.rabbit;

import br.com.projrabbit.model.Cliente;
import br.com.projrabbit.service.ClienteService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ClienteConsumer {

    @Autowired
    private ClienteService clienteService;


    @RabbitListener(queues = {"${queue.cliente.name}"})
    public void receive(@Payload Cliente cliente) {
        System.out.println("Id: " + cliente.getId() + "\nNome: " + cliente.getNome());
        clienteService.save(cliente);
    }
}
