package br.com.compravenda.controller;

import br.com.compravenda.constant.Constants;
import br.com.compravenda.model.Produtos;
import br.com.compravenda.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutosController {

    @Autowired
    private ProdutosService produtosService;

    @PostMapping(Constants.API_PRODUTOS)
    public Produtos save(@RequestBody Produtos produtos) {
        return  produtosService.save(produtos);
    }

    @GetMapping(Constants.API_PRODUTOS)
    public List<Produtos> findAll() {
        return produtosService.findAll();
    }

    @GetMapping(Constants.API_PRODUTOS + "/{id}")
    public Optional<Produtos> findById(@PathVariable("id") int id) {
        return produtosService.findById(id);
    }

    @PutMapping(Constants.API_PRODUTOS)
    public Produtos update(@RequestBody Produtos produtos) {
        return produtosService.save(produtos);
    }

    @DeleteMapping(Constants.API_PRODUTOS + "/{id}")
    public void delete(@PathVariable("id") int id) {
        produtosService.delete(id);
    }

}
