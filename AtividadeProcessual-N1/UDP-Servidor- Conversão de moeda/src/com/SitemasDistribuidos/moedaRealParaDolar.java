package com.SitemasDistribuidos;

import java.io.Serializable;

public class moedaRealParaDolar implements Serializable {

    private String descricao;
    private double valorDeReias;
    private double valorAtualDoDolar;
    private double valorCONVERTIDO;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorDeReias() {
        return valorDeReias;
    }

    public void setValorDeReias(double valorDeReias) {
        this.valorDeReias = valorDeReias;
    }

    public double getValorAtualDoDolar() {
        return valorAtualDoDolar;
    }

    public void setValorAtualDoDolar(double valorAtualDoDolar) {
        this.valorAtualDoDolar = valorAtualDoDolar;
    }

    public double getValorCONVERTIDO() {
        return valorCONVERTIDO;
    }

    public void setValorCONVERTIDO(double valorCONVERTIDO) {
        this.valorCONVERTIDO = valorCONVERTIDO;
    }
}
