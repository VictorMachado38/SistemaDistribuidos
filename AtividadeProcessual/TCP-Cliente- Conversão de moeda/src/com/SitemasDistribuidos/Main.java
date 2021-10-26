package com.SitemasDistribuidos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        moedaRealParaDolar moeda = new moedaRealParaDolar();
        ClieteTCP ClieteTCP = new ClieteTCP();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a descrição da conversão ?");
        moeda.setDescricao(scanner.nextLine());
        System.out.println("Qual o valor de reais(R$) que voce quer converter para dolar(US$) ? Digite o valor com ("+ "," + ") por ex 984,82.");
        moeda.setValorDeReias(scanner.nextDouble());
        System.out.println("Qual a cotação do dolar(US$) atual? Digite o valor com ("+ "," + ") por ex 984,82.");
        moeda.setValorAtualDoDolar(scanner.nextDouble());
        moeda.setFim(false);



        moeda = ClieteTCP.EnvidarDadosTCP(moeda);

        System.out.println("Descrição: "+moeda.getDescricao());
        System.out.println("Valor de reais: R$"+moeda.getValorDeReias());
        System.out.println("Valor atual do dolar US$: "+moeda.getValorAtualDoDolar());
        System.out.println("----------------------------------------------------------");
        System.out.println("Valor da conversão: US$" + moeda.getValorCONVERTIDO());

        // write your code here
    }
}
