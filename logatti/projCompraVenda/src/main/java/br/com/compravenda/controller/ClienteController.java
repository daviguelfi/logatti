package br.com.compravenda.controller;

import br.com.compravenda.constant.Constants;
import br.com.compravenda.model.Cliente;
import br.com.compravenda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping(Constants.API_CLIENTE)
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @GetMapping(Constants.API_CLIENTE)
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @GetMapping(Constants.API_CLIENTE + "/{id}")
    public Optional<Cliente> findById(@PathVariable("id") int id) {
        return clienteService.findById(id);
    }

    @PutMapping(Constants.API_CLIENTE)
    public Cliente update(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @DeleteMapping(Constants.API_CLIENTE + "/{id}")
    public void delete(@PathVariable("id") int id) {
        clienteService.delete(id);
    }

}

