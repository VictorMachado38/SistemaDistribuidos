package com.SitemasDistribuidos;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteUDP {

    public void enviarDados (Pessoa pessoa){

        //Comunicação
        DatagramSocket socketCliente;


        try{
            socketCliente = new DatagramSocket();
            InetAddress ip = InetAddress.getByName("localhost");
            byte[] dados = new byte[256];
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objStram = new ObjectOutputStream(outputStream);
            objStram.writeObject(pessoa);
            dados = outputStream.toByteArray();
            DatagramPacket pacote = new DatagramPacket(dados, dados.length,ip, 9000);

            socketCliente.send(pacote);
            System.out.println("Dados enviados para o servidor.....");


            //Rescevendo a respota
            byte[] dadosRespota = new byte[256];
            DatagramPacket pacoteRespota = new DatagramPacket(dadosRespota, dadosRespota.length,ip, 9000);
        }
        catch (Exception e){
            System.out.println("Mensagem de erro, ao enviador dados: " +  e.getMessage());
        }
    }
}
