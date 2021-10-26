package com.SitemasDistribuidos;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        moedaRealParaDolar moeda = new moedaRealParaDolar();
        ClienteUDP clienteUDP = new ClienteUDP();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a descrição da conversão ?");
        moeda.setDescricao(scanner.nextLine());
        System.out.println("Qual o valor de reais(R$) que voce quer converter para dolar(US$) ? Digite o valor com ("+ "," + ") por ex 984,82.");
        moeda.setValorDeReias(scanner.nextDouble());
        System.out.println("Qual a cotação do dolar(US$) atual? Digite o valor com ("+ "," + ") por ex 984,82.");
        moeda.setValorAtualDoDolar(scanner.nextDouble());



        moeda = clienteUDP.enviarDadaosParaconvesao(moeda);

        System.out.println("Descrição: "+moeda.getDescricao());
        System.out.println("Valor de reais: R$"+moeda.getValorDeReias());
        System.out.println("Valor atual do dolar US$: "+moeda.getValorAtualDoDolar());
        System.out.println("----------------------------------------------------------");
        System.out.println("Valor da conversão: US$" + moeda.getValorCONVERTIDO());

	// write your code here
    }
}
