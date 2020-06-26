package br.com.prova.controller;

import br.com.prova.constant.Constants;
import br.com.prova.model.Venda;
import br.com.prova.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping(Constants.API_VENDA)
    public void save(@RequestBody Venda venda) {
        vendaService.sendClienteRabbit(venda);
    }

    @GetMapping(Constants.API_VENDA)
    public void update(@RequestBody Venda venda) {
        vendaService.save(venda);
    }

    @DeleteMapping(Constants.API_VENDA + "/{id}")
    public void delete(@PathVariable("id") int id) {
        vendaService.delete(id);
    }

    @GetMapping(Constants.API_VENDA + "/{id}")
    public Optional<Venda> findById(@PathVariable("id") int id){
        return vendaService.findById(id);
    }
}
