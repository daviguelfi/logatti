package br.com.compravenda.repository;

import br.com.compravenda.model.Compras;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasRepository extends MongoRepository<Compras, Integer> {
}
