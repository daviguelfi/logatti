package br.com.compravenda.repository;

import br.com.compravenda.model.Produtos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutosRepository extends MongoRepository<Produtos, Integer> {
}
