package com.chemicalstock.chemicalstock.model.enums;

public enum TipoReagente {
    ÁCIDO("Ácido"),
    BASE("Base"),
    ÓXIDO("Óxido"),
    SAL("Sal"),
    PERÓXIDO("Peróxido"),
    HIDRETO("Hidreto"),
    INDICADOR("Indicador"),
    OUTRO("Outro");

    private final String descricao;

    TipoReagente(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
