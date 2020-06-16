package br.com.compravenda.service;

import br.com.compravenda.model.Cliente;
import br.com.compravenda.model.Fornecedor;
import br.com.compravenda.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

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
}
