package com.chemicalstock.chemicalstock.servicetest;

import com.chemicalstock.chemicalstock.model.Reagente;
import com.chemicalstock.chemicalstock.model.enums.TipoReagente;
import com.chemicalstock.chemicalstock.service.ReagenteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class ReagenteServiceTest {
    @Autowired
    private ReagenteService reagenteService;
    private Reagente reagente;

    public Reagente getReagente() {
        return new Reagente(
                "Ácido Sulforoso",
                "Marca 7",
                "Lote23",
                true,
                "1999",
                LocalDate.of(2025, 3, 10),
                TipoReagente.ÁCIDO
        );
    }

    @Test
    public void testSalvarReagente(Reagente reagente) {
        reagente = getReagente();
        Reagente resultado = reagenteService.salvar(reagente);

        Assertions.assertNotNull(resultado);
        Assertions.assertEquals(reagente.getId(), resultado.getId());
        Assertions.assertEquals(reagente.getNome(), resultado.getNome());

    }
}
