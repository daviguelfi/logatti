package br.com.projrabbit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

import java.sql.Struct;


@SpringBootApplication
public class MyApplication {

    @Value("${queue.produto.name}")
    private String produtoQueue;

    @Value("${queue.cliente.name}")
    private String clienteQueue;

    @Value("${queue.compra.name}")
    private String compraQueue;

    @Value("${queue.fornecedor.name}")
    private String fornecedorQueue;

    @Value("${queue.venda.name}")
    private String vendaQueue;


    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @Bean
    public Queue produtoQueue(){
        return new Queue(produtoQueue, true);
    }

    @Bean
    public Queue clienteQueue(){
        return new Queue(clienteQueue, true);
    }

    @Bean
    public Queue compraQueue(){
        return new Queue(compraQueue, true);
    }

    @Bean
    public Queue fornecedorQueue(){
        return new Queue(fornecedorQueue, true);
    }

    @Bean
    public Queue vendaQueue(){
        return new Queue(vendaQueue, true);
    }
}
