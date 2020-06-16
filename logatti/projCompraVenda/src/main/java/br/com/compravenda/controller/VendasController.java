package br.com.compravenda.controller;

import br.com.compravenda.constant.Constants;
import br.com.compravenda.model.Cliente;
import br.com.compravenda.model.Vendas;
import br.com.compravenda.service.VendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VendasController {

    @Autowired
    private VendasService vendasService;

    @PostMapping(Constants.API_VENDAS)
    public Vendas save(@RequestBody Vendas vendas) {
        return vendasService.save(vendas);
    }

    @GetMapping(Constants.API_VENDAS)
    public List<Vendas> findAll() {
        return vendasService.findAll();
    }

    @GetMapping(Constants.API_VENDAS + "/{id}")
    public Optional<Vendas> findById(@PathVariable("id") int id) {
        return vendasService.findById(id);
    }
    @PutMapping(Constants.API_VENDAS)
    public Vendas update(@RequestBody Vendas vendas) {
        return vendasService.save(vendas);
    }

    @DeleteMapping(Constants.API_VENDAS + "/{id}")
    public void delete(@PathVariable("id") int id) {
        vendasService.delete(id);
    }

}
