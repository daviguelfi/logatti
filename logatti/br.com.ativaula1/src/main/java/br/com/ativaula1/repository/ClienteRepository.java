package br.com.ativaula1.repository;

import br.com.ativaula1.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends MongoRepository<Cliente, Integer> {
}
