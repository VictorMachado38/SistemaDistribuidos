package com.SitemasDistribuidos;

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
        ObjectOutputStream saida;
        try{
            ServerSocket serverSocket = new ServerSocket(porta);
            Socket conexao;

            while(true){
                System.out.println("Servidor ativo na porta:" + porta);

                //fica aberto aguradando alguma conexao
                conexao = serverSocket.accept();

                System.out.println("Conexao estabelecida:" + conexao.getInetAddress().getHostAddress());


                entrada   = new ObjectInputStream(conexao.getInputStream());
                saida = new ObjectOutputStream(conexao.getOutputStream());
                moedaRealParaDolar moeda = (moedaRealParaDolar) entrada.readObject();
                moeda.setValorCONVERTIDO(conversaoDeRealParaDolar(moeda));



                while (!moeda.isFim()){
                    try{
                        saida.writeObject(moeda);
                        //  saida.writeInt(1);

                    }catch (Exception e){
                    }
                    System.out.println("Conexão encerrada pedo cliente");
                    saida.close();
                    entrada.close();
                    conexao.close();
                }

            }

        }
        catch (Exception e){

        }

    }
    public static double conversaoDeRealParaDolar(moedaRealParaDolar moedaRealParaDolar){

        moedaRealParaDolar.setValorCONVERTIDO(moedaRealParaDolar.getValorDeReias()/moedaRealParaDolar.getValorAtualDoDolar());
        return moedaRealParaDolar.getValorCONVERTIDO();

    }

}
