package br.com.compravenda.controller;

import br.com.compravenda.constant.Constants;
import br.com.compravenda.model.Compras;
import br.com.compravenda.service.ComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ComprasController {

    @Autowired
    private ComprasService comprasService;

    @PostMapping(Constants.API_COMPRAS)
    public Compras save(@RequestBody Compras compras) {
        return comprasService.save(compras);
    }

    @GetMapping(Constants.API_COMPRAS)
    public List<Compras> findAll() {
        return comprasService.findAll();
    }

    @GetMapping(Constants.API_COMPRAS + "/{id}")
    public Optional<Compras> findById(@PathVariable("id") int id) {
        return comprasService.findById(id);
    }

    @PutMapping(Constants.API_COMPRAS)
    public Compras update(@RequestBody Compras compras) {
        return comprasService.save(compras);
    }

    @DeleteMapping(Constants.API_COMPRAS + "/{id}")
    public void delete(@PathVariable("id") int id) {
        comprasService.delete(id);
    }
}
