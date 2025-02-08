package com.chemicalstock.chemicalstock.repositories;

import com.chemicalstock.chemicalstock.model.Reagente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ReagenteRepository extends JpaRepository<Reagente, Integer> {
    @Query("SELECT r from Reagente r WHERE r.nome LIKE %:nomeReagente%")
    List<Reagente> buscarPorNome(@Param(value = "nomeReagente") String nomeReagente);
}
