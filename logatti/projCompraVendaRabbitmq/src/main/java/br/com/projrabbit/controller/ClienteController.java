package br.com.projrabbit.controller;

import br.com.projrabbit.constant.Constants;
import br.com.projrabbit.model.Cliente;
import br.com.projrabbit.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping(Constants.API_CLIENTE)
    public void save(@RequestBody Cliente cliente) {
        clienteService.sendClienteRabbit(cliente);
    }

    @GetMapping(Constants.API_CLIENTE)
    public void update(@RequestBody Cliente cliente) {
        clienteService.save(cliente);
    }

    @DeleteMapping(Constants.API_CLIENTE + "/{id}")
    public void delete(@PathVariable("id") int id) {
        clienteService.delete(id);
    }

    @GetMapping(Constants.API_CLIENTE + "/{id}")
    public Optional<Cliente> findById(@PathVariable("id") int id) {
        return clienteService.findById(id);
    }

}
