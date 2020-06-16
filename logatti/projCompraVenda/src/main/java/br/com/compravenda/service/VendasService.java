package br.com.compravenda.service;

import br.com.compravenda.model.Vendas;
import br.com.compravenda.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendasService {

    @Autowired
    private VendasRepository vendasRepository;

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
}