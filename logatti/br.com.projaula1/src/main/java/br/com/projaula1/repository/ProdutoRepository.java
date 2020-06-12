package br.com.projaula1.repository;

import br.com.projaula1.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, Integer> {
    Optional<Produto> findById(int id);

    void deleteById(int id);
}
