package com.SitemasDistribuidos;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.Socket;

public class Cliente extends JFrame  {


    public Cliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        JLabel lblMessage = new JLabel("Verificar!");
        txtIP = new JTextField("localhost");
        txtPorta = new JTextField("9090");
        txtNome = new JTextField("Pessoa");
        Object[] texts = {lblMessage, txtIP, txtPorta, txtNome };
        JOptionPane.showMessageDialog(null, texts);


        JOptionPane.showMessageDialog(null, "Espere alguns segundos ate a pagina do chat abrir. \nCertifique-se que tem conexao com a internet,algumas imagens usadas sao pegas no servidor 'GitHub.com/VictorMachado38'.");



        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        TextArea_chat = new JTextArea();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        TextField_send = new JTextField();
        btn_send = new JButton();
        btn_exit = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(204, 255, 255));

        TextArea_chat.setColumns(20);
        TextArea_chat.setRows(5);
        TextArea_chat.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(TextArea_chat);

        jLabel2.setIcon(new JLabel() {
            public Icon getIcon() {
                try {
                    return new ImageIcon(
                            new java.net.URL("https://github.com/VictorMachado38/SistemaDistribuidos/blob/master/AtividadeProcessual-N2/chat/out/production/Chat/com/SitemasDistribuidos/resources/logo.png?raw=true")
                          //  new java.net.URL("")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel3.setFont(new Font("Consolas", 2, 14)); // NOI18N
        jLabel3.setText("Autor: Victor");

        TextField_send.setColumns(1);
        TextField_send.setFont(new Font("Tahoma", 0, 14)); // NOI18N

        btn_send.setBackground(new Color(255, 255, 204));
        btn_send.setIcon(new JLabel() {
            public Icon getIcon() {
                try {
                    return new ImageIcon(
                            new java.net.URL("https://github.com/VictorMachado38/SistemaDistribuidos/blob/master/AtividadeProcessual-N2/chat/out/production/Chat/com/SitemasDistribuidos/resources/send.png?raw=true")
                            //new java.net.URL("")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new Color(255, 153, 153));
        btn_exit.setIcon(new JLabel() {
            public Icon getIcon() {
                try {
                    return new ImageIcon(
                            new java.net.URL("https://github.com/VictorMachado38/SistemaDistribuidos/blob/master/AtividadeProcessual-N2/chat/out/production/Chat/com/SitemasDistribuidos/resources/sair.png?raw=true")
                           // new java.net.URL("")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(20, 20, 20))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(TextField_send, GroupLayout.PREFERRED_SIZE, 853, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btn_send, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1))
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(37, 37, 37)
                                                                .addComponent(jLabel2)
                                                                .addGap(38, 38, 38))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn_exit, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel2)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btn_send, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addComponent(TextField_send, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                                        .addComponent(btn_exit, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();

        TextArea_chat.setEditable(false);
        TextArea_chat.setBackground(new Color(240,240,240));
        TextArea_chat.setLineWrap(true);
        setResizable(false);
        setTitle("Atividade SISTEMA DISTRIBUIDOS - UNIALFA" + "                                                  Usuario: " + txtNome.getText());
    }// </editor-fold>

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            if (evt.getActionCommand().equals(btn_exit.getActionCommand()))
                sair();
        } catch (IOException newEvent) {
            newEvent.printStackTrace();
        }
    }

    private void btn_sendActionPerformed(java.awt.event.ActionEvent e) {
        try {
            if(e.getActionCommand().equals(btn_send.getActionCommand()))
                enviarMensagem(TextField_send.getText());
            else
            if(e.getActionCommand().equals(btn_exit.getActionCommand()))
                sair();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


    public void conectar() throws IOException{

        socket = new Socket(txtIP.getText(),Integer.parseInt(txtPorta.getText()));
        ou = socket.getOutputStream();
        ouw = new OutputStreamWriter(ou);
        bfw = new BufferedWriter(ouw);
        bfw.write(txtNome.getText()+"\r\n");
        bfw.flush();
    }

    public void enviarMensagem(String msg) throws IOException{

        if(msg.equals("Sair")){
            bfw.write("Desconectado \r\n");
            TextArea_chat.append("Desconectado \r\n");
        }else{
            bfw.write(msg+"\r\n");
            TextArea_chat.append( txtNome.getText() + " --> " +         TextField_send.getText()+"\r\n");
        }
        bfw.flush();
        TextField_send.setText("");
    }

    public void escutar() throws IOException{

        InputStream in = socket.getInputStream();
        InputStreamReader inr = new InputStreamReader(in);
        BufferedReader bfr = new BufferedReader(inr);
        String msg = "";

        while(!"Sair".equalsIgnoreCase(msg))

            if(bfr.ready()){
                msg = bfr.readLine();
                if(msg.equals("Sair"))
                    TextArea_chat.append("Servidor caiu! \r\n");
                else
                    TextArea_chat.append(msg+"\r\n");
            }
    }

    public void sair() throws IOException{

        enviarMensagem("Sair");
        bfw.close();
        ouw.close();
        ou.close();
        socket.close();
    }


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
           /* public void run() {
                new interfaceChat().setVisible(true);
            }
            */
          /* public void run() {
               //  new interfaceChat().setVisible(true);
               // conectar();
               interfaceChat cli = new interfaceChat();
                   cli.setVisible(true);
                   try {
                   cli.conectar();
                   cli.escutar();
               } catch (IOException e) {
                  System.out.printf("Erro no main     :" + e.getMessage());
                   e.printStackTrace();
               }
               //cli.escutar();


           }
        });

           */


        //  new interfaceChat().setVisible(true);
        // conectar();
        Cliente cli = new Cliente();
        cli. setResizable(false);
        cli.setLocationRelativeTo(null);
        cli.setVisible(true);

        try {
            cli.conectar();
            cli.escutar();
        } catch (IOException e) {
            System.out.printf("Erro no main     :" + e.getMessage());
            e.printStackTrace();
        }
    }

    private JTextArea TextArea_chat;
    private JTextField TextField_send;
    private JButton btn_exit;
    private JButton btn_send;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private static final long serialVersionUID = 1L;
    private Socket socket;
    private OutputStream ou ;
    private Writer ouw;
    private BufferedWriter bfw;
    private JTextField txtIP;
    private JTextField txtPorta;
    private JTextField txtNome;


}
