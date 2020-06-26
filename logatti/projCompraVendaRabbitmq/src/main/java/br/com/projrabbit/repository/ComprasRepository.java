package br.com.projrabbit.repository;

import br.com.projrabbit.model.Compras;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasRepository extends MongoRepository<Compras, Integer> {
}
