package br.com.projrabbit.service;

import br.com.projrabbit.model.Produtos;
import br.com.projrabbit.model.Vendas;
import br.com.projrabbit.rabbit.VendasProducer;
import br.com.projrabbit.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendasService {
    @Autowired
    private VendasRepository vendasRepository;

    @Autowired
    private VendasProducer vendasProducer;

    public void sendVendasRabbit(Vendas vendas) {
        vendasProducer.send(vendas);
    }

    public Vendas save(Vendas vendas) {
        return vendasRepository.save(vendas);
    }

    public List<Vendas> findAll() {
        return vendasRepository.findAll();
    }

    public Optional<Vendas> findById(int id) {
        return vendasRepository.findById(id);
    }

    public void delete(int id) {
        vendasRepository.deleteById(id);
    }

    public void deleteAll(){
        vendasRepository.deleteAll();
    }
}
