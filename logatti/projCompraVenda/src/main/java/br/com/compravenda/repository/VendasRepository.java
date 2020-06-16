package br.com.compravenda.repository;

import br.com.compravenda.model.Vendas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendasRepository extends MongoRepository<Vendas, Integer> {
}
