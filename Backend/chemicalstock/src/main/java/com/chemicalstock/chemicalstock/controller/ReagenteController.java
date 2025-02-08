package com.chemicalstock.chemicalstock.controller;


import com.chemicalstock.chemicalstock.model.Reagente;
import com.chemicalstock.chemicalstock.service.ReagenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/reagentes")
public class ReagenteController {
    @Autowired
    private ReagenteService reagenteService;

    @GetMapping
    public ResponseEntity<List<Reagente>> buscarTodosReagentes() {
        Optional<List<Reagente>> reagentes = Optional.of(reagenteService.buscarTodos());
        if (reagentes.isPresent()) {
            return ResponseEntity.ok().body(reagentes.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping(value ="/{nome}")
    public ResponseEntity<List<Reagente>> buscarReagentePorNome(@PathVariable String nome) {
        Optional<List<Reagente>> reagentes = Optional.of(reagenteService.buscarPorNome(nome));
        if (reagentes.isPresent()) {
            return ResponseEntity.ok().body(reagentes.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}
