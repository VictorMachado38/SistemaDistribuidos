package com.SitemasDistribuidos;

public class Main {

    public static void main(String[] args) {

         moedaRealParaDolar moeda = new moedaRealParaDolar();
        ClienteUDP clienteUDP = new ClienteUDP();
       // ClienteUDP1 ClienteUDP1 = new ClienteUDP1();

        moeda.setNome("Conversão de real para DOLAR");
        moeda.setValorDeReias(100.00);
        moeda.setValorAtualDoDolar(5.55);
        moeda.setValorCONVERTIDO(0.0);



        moeda = clienteUDP.enviarDadaosParaconvesao(moeda);

        System.out.println("Nome: "+moeda.getNome());
        System.out.println("Valor de reais: R$"+moeda.getValorDeReias());
        System.out.println("Valor atual do dolar: "+moeda.getValorAtualDoDolar());
        System.out.println("----------------------------------------------------------");
        System.out.println("Valor da conversão:");
        System.out.println("Foram comvertidos R$"+moeda.getValorDeReias() +"para dolar, com o doler custando: US$"+moeda.getValorAtualDoDolar() +"a CONVERSÃO DEU: US$" + moeda.getValorCONVERTIDO());
	// write your code here
    }
}
