package br.com.prova.rabbit;

import br.com.prova.model.Funcionario;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FuncionarioProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Qualifier("funcionarioQueue")
    @Autowired
    private Queue queue;

    public void send(Funcionario funcionario) {
        rabbitTemplate.convertAndSend(this.queue.getName(), funcionario);
    }
}
