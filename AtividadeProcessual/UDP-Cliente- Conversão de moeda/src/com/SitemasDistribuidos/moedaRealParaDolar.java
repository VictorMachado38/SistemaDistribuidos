package com.SitemasDistribuidos;

import java.io.Serializable;

public class moedaRealParaDolar implements Serializable {

    private String nome;
    private double valorDeReias;
    private double valorAtualDoDolar;
    private double valorCONVERTIDO;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
