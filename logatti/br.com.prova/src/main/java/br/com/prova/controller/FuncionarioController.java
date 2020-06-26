package br.com.prova.controller;

import br.com.prova.constant.Constants;
import br.com.prova.model.Funcionario;
import br.com.prova.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping(Constants.API_FUNCIONARIO)
    public void save(@RequestBody Funcionario funcionario) {
        funcionarioService.sendFuncionarioRabbit(funcionario);
    }

    @GetMapping(Constants.API_FUNCIONARIO)
    public void update(@RequestBody Funcionario funcionario) {
        funcionarioService.save(funcionario);
    }

    @DeleteMapping(Constants.API_FUNCIONARIO + "/{id}")
    public void delete(@PathVariable("id") int id) {
        funcionarioService.delete(id);
    }

    @GetMapping(Constants.API_FUNCIONARIO + "/{id}")
    public Optional<Funcionario> findById(@PathVariable("id") int id){
        return funcionarioService.findById(id);
    }
}
