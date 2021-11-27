package com.SitemasDistribuidos;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class ServidorUDP {

    public static void main(String[] args) throws SocketException {

        DatagramSocket serverSocket;
        serverSocket = new DatagramSocket(9000);


        byte[] dadosRecebidos = new byte[256];

        while(true){

            DatagramPacket pacoteRecebidos = new DatagramPacket(dadosRecebidos,dadosRecebidos.length);

            try {
                System.out.println("Servidor rodando.....");
                serverSocket.receive(pacoteRecebidos);

                ByteArrayInputStream inputStream = new ByteArrayInputStream(dadosRecebidos);
              //  ByteArrayInputStream inputStream = new ByteArrayInputStream(dadosRecebidos);
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                //ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

                moedaRealParaDolar moedaRealParaDolar = (moedaRealParaDolar) objectInputStream.readObject();


                moedaRealParaDolar.setValorCONVERTIDO(conversaoDeRealParaDolar(moedaRealParaDolar));
                System.out.println("Valor convertido de REAL para ---> Dolar");





                // Devolvendo o obejeto calculado
                System.out.println("Resposta ira ser preparada");
                InetAddress ip = pacoteRecebidos.getAddress();
                System.out.println("O IP dento do InetAdderess:"+ip );
                int port = pacoteRecebidos.getPort();
                System.out.println("A port que está no int: "+ port);

                // Conversão do objeto em array de bytes e enviando resposta para o cliente.
                byte[] dadosRespostaDoServidor = new byte[256];
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                ObjectOutputStream objStram = new ObjectOutputStream(outputStream);
                objStram.writeObject(moedaRealParaDolar);
                dadosRespostaDoServidor = outputStream.toByteArray();
                DatagramPacket pacoteRespotaDoServidor = new DatagramPacket(dadosRespostaDoServidor, dadosRespostaDoServidor.length,ip, port);

                serverSocket.send(pacoteRespotaDoServidor);
                System.out.println("Respota enviada....");



            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("O erro que deu:" + e.getMessage());
            }

        }

    }


    public static double conversaoDeRealParaDolar(moedaRealParaDolar moedaRealParaDolar){

        moedaRealParaDolar.setValorCONVERTIDO(moedaRealParaDolar.getValorDeReias()/moedaRealParaDolar.getValorAtualDoDolar());
        return moedaRealParaDolar.getValorCONVERTIDO();
         /*
         Ou
       double aux =  moedaRealParaDolar.getValorDeReias()/moedaRealParaDolar.getValorAtualDoDolar()
       moedaRealParaDolar.setValorCONVERTIDO(aux);
       return moedaRealParaDolar;
          */
    }



}
