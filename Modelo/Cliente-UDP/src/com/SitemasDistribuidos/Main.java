package com.SitemasDistribuidos;

public class Main {

    public static void main(String[] args) {

        ClienteUDP clienteUDP = new ClienteUDP();
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Victor Augusto");
        pessoa.setAltura(1.77);
        pessoa.setPeso(95);


        pessoa = clienteUDP.enviarDados(pessoa);




        System.out.println("NOME NO INDIVIOU:" + pessoa.getNome());
        System.out.println("ALTURA NO INDIVIOU:" + pessoa.getAltura() + "M");
        System.out.println("PESO NO INDIVIOU:" + pessoa.getPeso() + " Kg");
        System.out.println("ICM NO INDIVIOU:" + pessoa.getIMC());

	// write your code here
    }
}
