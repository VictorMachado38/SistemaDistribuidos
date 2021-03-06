package com.SitemasDistribuidos;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteUDP {

    public Pessoa enviarDados (Pessoa pessoa){

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
            DatagramPacket pacoteRespotaDoServidor = new DatagramPacket(dados, dados.length,ip, 9100);

            socketCliente.send(pacoteRespotaDoServidor);
            System.out.println("Dados enviados para o servidor.....");


            //Rescevendo a respota





            byte[] dadosRespota = new byte[256];
            DatagramPacket pacoteRespota = new DatagramPacket(dadosRespota, dadosRespota.length);
            socketCliente.receive(pacoteRespota);

            System.out.println("Pacote recebido do servidor");

            //Depois que recebe a respota do servidor aqui faz a conversão
            ByteArrayInputStream inputStream = new ByteArrayInputStream(dadosRespota);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            pessoa = new Pessoa();
            pessoa = (Pessoa) objectInputStream.readObject();

            return pessoa;
        }
        catch (Exception e){
            System.out.println("Mensagem de erro, ao enviador dados: " +  e.getMessage());
            return null;
        }
    }
}
