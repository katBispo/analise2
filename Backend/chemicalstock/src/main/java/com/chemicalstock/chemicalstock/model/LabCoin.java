package com.chemicalstock.chemicalstock.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="tb_labcoin")
public class LabCoin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

