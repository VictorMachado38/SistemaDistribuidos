package com.SitemasDistribuidos;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClieteTCP {

    public moedaRealParaDolar EnvidarDadosTCP(moedaRealParaDolar moedaRealParaDolar){

        ObjectInputStream entrada;
        ObjectOutputStream saida;

        Socket conexao;

        try{
            conexao = new Socket("localhost",9000);
            System.out.println("Conectado ao servidor");
            saida = new ObjectOutputStream(conexao.getOutputStream());
            entrada = new ObjectInputStream(conexao.getInputStream());

            //Enviando pessoa para calcular IMC
            saida.writeObject(moedaRealParaDolar);

            //Recebendo a respota do servior
            moedaRealParaDolar = (moedaRealParaDolar) entrada.readObject();
            entrada.close();
            saida.close();
            conexao.close();


        }catch (Exception e) {
        }
        return moedaRealParaDolar;
    }

}
