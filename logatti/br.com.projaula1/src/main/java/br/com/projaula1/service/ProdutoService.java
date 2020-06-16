package br.com.projaula1.service;

import br.com.projaula1.model.Produto;
import br.com.projaula1.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(Produto produto){
       return produtoRepository.save(produto);
    }
    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }
    public Optional<Produto> findById(int id){
        return produtoRepository.findById(Integer.parseInt(String.valueOf(id)));
    }
    public void delete(int id){
        produtoRepository.deleteById(id);
    }
}