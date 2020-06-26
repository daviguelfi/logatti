package br.com.projrabbit.service;

import br.com.projrabbit.model.Compras;
import br.com.projrabbit.rabbit.ComprasProducer;
import br.com.projrabbit.repository.ComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComprasService {
    @Autowired
    private ComprasRepository comprasRepository;

    @Autowired
    private ComprasProducer comprasProducer;

    public void sendComprasRabbit(Compras compras) {
        comprasProducer.send(compras);
    }

    public Compras save(Compras compras) {
        return comprasRepository.save(compras);
    }

    public List<Compras> findAll() {
        return comprasRepository.findAll();
    }

    public Optional<Compras> findById(int id) {
        return comprasRepository.findById(id);
    }

    public void delete(int id) {
        comprasRepository.deleteById(id);
    }

    public void deleteAll(){
        comprasRepository.deleteAll();
    }
}
