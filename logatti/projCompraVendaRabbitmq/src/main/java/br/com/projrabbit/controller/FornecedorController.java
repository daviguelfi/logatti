package br.com.projrabbit.controller;

import br.com.projrabbit.constant.Constants;
import br.com.projrabbit.model.Fornecedor;
import br.com.projrabbit.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping(Constants.API_FORNECEDOR)
    public void save(@RequestBody Fornecedor fornecedor) {
        fornecedorService.sendFornecedorRabbit(fornecedor);
    }

    @GetMapping(Constants.API_FORNECEDOR)
    public void update(@RequestBody Fornecedor fornecedor) {
        fornecedorService.save(fornecedor);
    }

    @DeleteMapping(Constants.API_FORNECEDOR + "/{id}")
    public void delete(@PathVariable("id") int id) {
        fornecedorService.delete(id);
    }

    @GetMapping(Constants.API_FORNECEDOR + "/{id}")
    public Optional<Fornecedor> findById(@PathVariable("id") int id) {
        return fornecedorService.findById(id);
    }
}
