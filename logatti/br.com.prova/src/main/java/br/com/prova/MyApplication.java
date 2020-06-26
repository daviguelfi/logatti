package br.com.prova;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyApplication {

    @Value("${queue.funcionario.name}")
    private String funcionarioQueue;

    @Value("${queue.venda.name}")
    private String vendaQueue;

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @Bean
    public Queue funcionarioQueue(){
        return new Queue(funcionarioQueue, true);
    }

    @Bean
    public Queue vendaQueue(){
        return new Queue(vendaQueue, true);
    }

}
