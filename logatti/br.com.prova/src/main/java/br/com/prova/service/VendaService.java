package br.com.prova.service;

import br.com.prova.model.Venda;
import br.com.prova.rabbit.VendaProducer;
import br.com.prova.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    private VendaProducer vendaProducer;

    @Autowired
    private VendaRepository vendaRepository;

    public void sendClienteRabbit(Venda venda) {
        vendaProducer.send(venda);
    }

    public Venda save(Venda venda) {
        return vendaRepository.save(venda);
    }

    public List<Venda> findAll() {
        return vendaRepository.findAll();
    }

    public Optional<Venda> findById(int id) {
        return vendaRepository.findById(id);
    }

    public void delete(int id) {
        vendaRepository.deleteById(id);
    }

    public void deleteAll(){
        vendaRepository.deleteAll();
    }
}
