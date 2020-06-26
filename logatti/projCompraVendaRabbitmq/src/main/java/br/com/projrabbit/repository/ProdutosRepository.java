package br.com.projrabbit.repository;

import br.com.projrabbit.model.Produtos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends MongoRepository<Produtos, Integer> {
}
