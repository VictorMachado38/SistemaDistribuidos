package com.SitemasDistribuidos;

public class Main {

    public static void main(String[] args) {


        ClienteUDP clienteUDP = new ClienteUDP();

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("VITAO");
        pessoa.setAltura(1);
        pessoa.setPeso(95);


        clienteUDP.enviarDados(pessoa);


        System.out.println("NOME NO INDIVIOU:" + pessoa.getNome());

	// write your code here
    }
}
