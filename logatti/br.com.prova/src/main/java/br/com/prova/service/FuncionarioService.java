package br.com.prova.service;

import br.com.prova.model.Funcionario;
import br.com.prova.rabbit.FuncionarioProducer;
import br.com.prova.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioProducer funcionarioProducer;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public void sendFuncionarioRabbit(Funcionario funcionario) {
        funcionarioProducer.send(funcionario);
    }

    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> findById(int id) {
        return funcionarioRepository.findById(id);
    }

    public void delete(int id) {
        funcionarioRepository.deleteById(id);
    }

    public void deleteAll(){
        funcionarioRepository.deleteAll();
    }
}
