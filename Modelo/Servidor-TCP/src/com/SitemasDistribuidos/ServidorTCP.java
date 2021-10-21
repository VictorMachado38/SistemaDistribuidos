package com.SitemasDistribuidos;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {

    public static void main(String[] args) {

     iniciar(9000);
    }

    public static void iniciar(int porta){

        ObjectInputStream entrada;
        ObjectOutputStream  saida;
        try{
            ServerSocket serverSocket = new ServerSocket(porta);
            Socket conexao;

            while(true){
                System.out.println("Servidor ativo na porta:" + porta);

                //fica aberto aguradando alguma conexao
                conexao = serverSocket.accept();

                System.out.println("Conexao estabelecida:" + conexao.getInetAddress().getHostAddress());


               entrada   = new ObjectInputStream(conexao.getInputStream());
               Pessoa pessoa = (Pessoa) entrada.readObject();
               pessoa.setIMC(calculaIMC(pessoa));

                saida = new ObjectOutputStream(conexao.getOutputStream());

               while (!pessoa.isFim()){
                   try{
                       saida.writeObject(pessoa);


                   }catch (Exception e){

                   }

               }
            }

        }
        catch (Exception e){

        }

    }
    public static double calculaIMC(Pessoa pessoa) {
        pessoa.setIMC(pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura()));
        System.out.println("IMC calculado...");
        return pessoa.getIMC();
    }

}
