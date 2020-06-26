package br.com.projrabbit.service;

import br.com.projrabbit.model.Produtos;
import br.com.projrabbit.rabbit.ProdutoProducer;
import br.com.projrabbit.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository produtosRepository;

    @Autowired
    private ProdutoProducer produtoProducer;

    public void sendProdutoRabbit(Produtos produtos) {
        produtoProducer.send(produtos);
    }

    public void save(Produtos produtos){
        produtosRepository.save(produtos);
    }
    public List<Produtos> findAll(){
        return produtosRepository.findAll();
    }

    public Optional<Produtos> findById(int id){
        return produtosRepository.findById(id);
    }

    public void delete(int id){
        produtosRepository.deleteById(id);
    }

    public void deleteAll(){
        produtosRepository.deleteAll();
    }

}
