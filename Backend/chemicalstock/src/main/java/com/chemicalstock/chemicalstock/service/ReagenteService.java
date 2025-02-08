package com.chemicalstock.chemicalstock.service;


import com.chemicalstock.chemicalstock.model.Reagente;
import com.chemicalstock.chemicalstock.repositories.ReagenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReagenteService {
    @Autowired
    private ReagenteRepository reagenteRepository;

    public List<Reagente> buscarTodos() {
        List<Reagente> reagentes = reagenteRepository.findAll();
        return reagentes;
    }
    public Reagente salvar(Reagente reagente) {
        return reagenteRepository.save(reagente);
    }
    public List<Reagente> buscarPorNome(String nome) {
        List<Reagente> reagentes = reagenteRepository.buscarPorNome(nome);
        return reagentes;
    }
}
