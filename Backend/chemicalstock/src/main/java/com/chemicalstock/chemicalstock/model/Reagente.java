package com.chemicalstock.chemicalstock.model;


import com.chemicalstock.chemicalstock.model.enums.TipoReagente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_reagente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reagente implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column(nullable = false, length = 60)
    private String nome;

    @Column(nullable = false,length = 50)
    private String marca;

    @Column(nullable = false,length = 50)
    private String lote;

    @Column(nullable = false)
    private boolean controlado;

    @Column(nullable = true,length = 50)
    private String numeroControlado;

    @Column(nullable = false)
    private LocalDate dataValidade;

    @Column
    private TipoReagente tipoReagente;

    public Reagente(String nome, String marca, String lote, boolean controlado, String numeroControlado, LocalDate dataValidade, TipoReagente tipo) {
        this.nome = nome;
        this.marca = marca;
        this.lote = lote;
        this.controlado = controlado;
        this.numeroControlado = numeroControlado;
        this.dataValidade = dataValidade;
        this.tipoReagente = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reagente reagente = (Reagente) o;
        return Objects.equals(id, reagente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getLote() {
        return lote;
    }

    public boolean isControlado() {
        return controlado;
    }

    public String getNumeroControlado() {
        return numeroControlado;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public TipoReagente getTipoReagente() {
        return tipoReagente;
    }
}
