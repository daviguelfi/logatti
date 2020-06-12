package br.com.ativaula1.service;

import br.com.ativaula1.model.Cliente;
import br.com.ativaula1.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente) {
        clienteRepository.save(cliente);
        return  cliente;
    }
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }
    public Optional<Cliente> findById(int id) {
        return  clienteRepository.findById(id);
    }
    public void delete(int id) {
        clienteRepository.deleteById(id);
    }
    public  void deleteAll() {
        clienteRepository.deleteAll();
    }
}
