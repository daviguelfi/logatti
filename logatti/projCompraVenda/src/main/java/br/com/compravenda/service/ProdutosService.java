package br.com.compravenda.service;

import br.com.compravenda.model.Cliente;
import br.com.compravenda.model.Produtos;
import br.com.compravenda.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository produtosRepository;

    public Produtos save(Produtos produtos) {
        return  produtosRepository.save(produtos);
    }

    public List<Produtos> findAll() {
        return produtosRepository.findAll();
    }

    public Optional<Produtos> findById(int id) {
        return produtosRepository.findById(id);
    }

    public void delete(int id) {
        produtosRepository.deleteById(id);
    }
}

