package br.com.projrabbit.repository;

import br.com.projrabbit.model.Fornecedor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends MongoRepository<Fornecedor, Integer> {
}
