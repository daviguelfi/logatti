package br.com.ativaula1.repository;

import br.com.ativaula1.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, Integer> {
}
