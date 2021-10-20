package com.SitemasDistribuidos;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServidorUDP {

    public static void main(String[] args) throws SocketException {
        // write your code here

        DatagramSocket  serverSocket;
        serverSocket = new DatagramSocket(9000);
        /*
    try{
        serverSoket = new DatagramSocket(porta);
    }
    catch (Exception e){
        e.printStackTrace();
    }

         */

    byte[] dadosRecebidos = new byte[256];

    while(true){
        DatagramPacket pacoteRecebidos = new DatagramPacket(dadosRecebidos,dadosRecebidos.length);

        try {
            System.out.println("Servidor rodando.....");
            serverSocket.receive(pacoteRecebidos);

            ByteArrayInputStream inputStream = new ByteArrayInputStream(dadosRecebidos);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Pessoa pessoa = (Pessoa) objectInputStream.readObject();
            pessoa.setIMC( calcularIMC(pessoa));
            System.out.println("Resposta enviada");

            // Devolvendo o obejeto calculado
            InetAddress ip = pacoteRecebidos.getAddress();
            System.out.println("O IP dento do InetAdderess:"+ip );
            int port = pacoteRecebidos.getPort();
            System.out.println("A port que está no int: "+port);

            // Conversão do objeto em array de bytes e enviando resposta para o cliente.
            byte[] dadosRespostaDoServidor = new byte[256];
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objStram = new ObjectOutputStream(outputStream);
            objStram.writeObject(pessoa);
            dadosRespostaDoServidor = outputStream.toByteArray();
            DatagramPacket pacoteRespotaDoServidor = new DatagramPacket(dadosRespostaDoServidor, dadosRespostaDoServidor.length,ip, 9000);

            serverSocket.send(pacoteRespotaDoServidor);
            System.out.println("Respota enviada....");


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("O erro que deu:" + e.getMessage());
        }

    }

    }


    public static double calcularIMC(Pessoa pessoa){
        pessoa.setIMC(pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura()));
        return pessoa.getIMC();
    }
}
