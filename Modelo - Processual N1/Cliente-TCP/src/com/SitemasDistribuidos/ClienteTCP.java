package com.SitemasDistribuidos;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClienteTCP {

    public Pessoa EnvidarDadosTCP(Pessoa pessoa){

        ObjectInputStream entrada;
        ObjectOutputStream saida;

        Socket conexao;

        try{
            conexao = new Socket("localhost",9000);
            System.out.println("Conectado ao servidor");
            saida = new ObjectOutputStream(conexao.getOutputStream());
            entrada = new ObjectInputStream(conexao.getInputStream());

            //Enviando pessoa para calcular IMC
            saida.writeObject(pessoa);

            //Recebendo a respota do servior
            pessoa = (Pessoa) entrada.readObject();
            entrada.close();
            saida.close();
            conexao.close();


        }catch (Exception e) {
        }
        return pessoa;
    }


}
