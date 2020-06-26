package br.com.projrabbit.controller;

import br.com.projrabbit.constant.Constants;
import br.com.projrabbit.model.Cliente;
import br.com.projrabbit.model.Vendas;
import br.com.projrabbit.service.VendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class VendasController {

    @Autowired
    private VendasService vendasService;

    @PostMapping(Constants.API_VENDAS)
    public void save(@RequestBody Vendas vendas) {
        vendasService.sendVendasRabbit(vendas);
    }

    @GetMapping(Constants.API_VENDAS)
    public void update(@RequestBody Vendas vendas) {
        vendasService.save(vendas);
    }

    @DeleteMapping(Constants.API_VENDAS + "/{id}")
    public void delete(@PathVariable("id") int id) {
        vendasService.delete(id);
    }

    @GetMapping(Constants.API_VENDAS + "/{id}")
    public Optional<Vendas> findById(@PathVariable("id") int id) {
        return vendasService.findById(id);
    }
}
