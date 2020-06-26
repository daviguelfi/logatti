package br.com.projrabbit.repository;

import br.com.projrabbit.model.Vendas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendasRepository extends MongoRepository<Vendas, Integer> {
}
