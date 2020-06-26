package br.com.projrabbit.controller;

import br.com.projrabbit.constant.Constants;
import br.com.projrabbit.model.Compras;
import br.com.projrabbit.service.ComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ComprasController {

    @Autowired
    private ComprasService comprasService;

    @PostMapping(Constants.API_COMPRAS)
    public void save(@RequestBody Compras compras) {
        comprasService.sendComprasRabbit(compras);
    }

    @GetMapping(Constants.API_COMPRAS)
    public void update(@RequestBody Compras compras) {
        comprasService.save(compras);
    }

    @DeleteMapping(Constants.API_COMPRAS + "/{id}")
    public void delete(@PathVariable("id") int id) {
        comprasService.delete(id);
    }

    @GetMapping(Constants.API_COMPRAS + "/{id}")
    public Optional<Compras> findById(@PathVariable("id") int id) {
        return comprasService.findById(id);
    }
}
