package br.com.cliente.controller;

import br.com.cliente.constant.Constants;
import br.com.cliente.model.Cliente;
import br.com.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping(Constants.API_CLIENTE)
    public Cliente save(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @GetMapping(Constants.API_CLIENTE)
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

    @PutMapping(Constants.API_CLIENTE)
    public Cliente update(@RequestBody Cliente cliente){
        return this.save(cliente);
    }

    @DeleteMapping(Constants.API_CLIENTE + "/{id}")
    public void delete(@PathVariable("id") int id){
        clienteService.delete(id);
    }

    @GetMapping(Constants.API_CLIENTE + "/{id}")
    public Optional<Cliente> findById(@PathVariable("id") int id){
        return clienteService.findById(id);
    }
}
