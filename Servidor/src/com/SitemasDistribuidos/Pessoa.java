package com.SitemasDistribuidos;
import java.io.Serializable;

public class Pessoa implements Serializable{

    private String nome;
    private double altura;
    private double peso;
    private double IMC;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getIMC() {
        return IMC;
    }
    public void setIMC(double iMC) {
        IMC = iMC;
    }

}
