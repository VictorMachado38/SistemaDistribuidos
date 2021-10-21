package com.SitemasDistribuidos;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClienteTCP clienteTCP = new ClienteTCP();
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("VITAO");
        pessoa.setAltura(1);
        pessoa.setPeso(95);
        pessoa.setFim(false);


        clienteTCP.EnvidarDadosTCP(pessoa);

        System.out.println("Nome da pessoa: "+ pessoa.getNome());
        System.out.println("Altura da pessoa: "+ pessoa.getAltura());
        System.out.println("Peso da pessoa: "+ pessoa.getPeso());
        System.out.println("ICM da pessoa: "+ pessoa.getIMC());

    }
}
