package br.com.projrabbit.controller;

import br.com.projrabbit.constant.Constants;
import br.com.projrabbit.model.Cliente;
import br.com.projrabbit.model.Produtos;
import br.com.projrabbit.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProdutosController {

    @Autowired
    private ProdutosService produtosService;

    @PostMapping(Constants.API_PRODUTOS)
    public void save(@RequestBody Produtos produtos) {
        produtosService.sendProdutoRabbit(produtos);
    }

    @GetMapping(Constants.API_PRODUTOS)
    public void update(@RequestBody Produtos produtos) {
        produtosService.save(produtos);
    }

    @DeleteMapping(Constants.API_PRODUTOS + "/{id}")
    public void delete(@PathVariable("id") int id) {
        produtosService.delete(id);
    }

    @GetMapping(Constants.API_PRODUTOS + "/{id}")
    public Optional<Produtos> findById(@PathVariable("id") int id) {
        return produtosService.findById(id);
    }
}
