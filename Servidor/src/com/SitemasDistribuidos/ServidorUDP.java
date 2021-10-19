package com.SitemasDistribuidos;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
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

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("O erro que deu:" + e.getMessage());
        }

    }

    }

    public static double calcularIMC(Pessoa pessoa){
        double IMC = 0;
        return IMC;
    }
}
