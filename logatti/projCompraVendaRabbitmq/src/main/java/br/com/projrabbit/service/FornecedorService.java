package br.com.projrabbit.service;

import br.com.projrabbit.model.Fornecedor;
import br.com.projrabbit.rabbit.FornecedorProducer;
import br.com.projrabbit.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Autowired
    private FornecedorProducer fornecedorProducer;

    public void sendFornecedorRabbit(Fornecedor fornecedor) {
        fornecedorProducer.send(fornecedor);
    }

    public Fornecedor save(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> findAll() {
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> findById(int id) {
        return fornecedorRepository.findById(id);
    }

    public void delete(int id) {
        fornecedorRepository.deleteById(id);
    }

    public void deleteAll(){
        fornecedorRepository.deleteAll();
    }
}
