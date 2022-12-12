package com.escahe;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;
import java.awt.*;

public class View extends javax.swing.JFrame {

    public View() {
        initComponents();
    }
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainTabbedPane = new javax.swing.JTabbedPane();
        converterTab = new javax.swing.JPanel();
        txtfAmount = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        jcbFrom = new javax.swing.JComboBox<>();
        jcbTo = new javax.swing.JComboBox<>();
        lblResult = new javax.swing.JLabel();
        txtfResult = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();
        rbCurrency = new javax.swing.JRadioButton();
        rbTemp = new javax.swing.JRadioButton();
        rbLength = new javax.swing.JRadioButton();
        rbDigitalStorage = new javax.swing.JRadioButton();
        lblEscahe = new javax.swing.JLabel();
        logoDinoConverter = new javax.swing.JLabel();
        aboutTab = new javax.swing.JPanel();
        lblDescription = new javax.swing.JLabel();
        logoGitHub = new javax.swing.JLabel();
        logoLinkedIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtfAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfAmountKeyTyped(evt);
            }
        });

        lblAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAmount.setText("Valor:");

        jcbTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblResult.setText("Resultado:");

        txtfResult.setEditable(false);
        txtfResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfResultActionPerformed(evt);
            }
        });

        btnConvert.setText("Convertir");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        logoGitHub.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
                if ( desktop != null && desktop.isSupported(Desktop.Action.BROWSE) ) {
                    try {
                        desktop.browse( new URI("https://github.com/escahe") );
                    } catch ( Exception ex ) {
                        System.err.println( ex.getMessage() );
                    }
                } 
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });
        logoLinkedIn.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
                if ( desktop != null && desktop.isSupported(Desktop.Action.BROWSE) ) {
                    try {
                        desktop.browse( new URI("https://www.linkedin.com/in/escahe/") );
                    } catch ( Exception ex ) {
                        System.err.println( ex.getMessage() );
                    }
                } 
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });

        buttonGroup1.add(rbCurrency);
        rbCurrency.setSelected(true);
        rbCurrency.setText("Monedas");

        buttonGroup1.add(rbTemp);
        rbTemp.setText("Temperatura");

        buttonGroup1.add(rbLength);
        rbLength.setText("Longitud");

        buttonGroup1.add(rbDigitalStorage);
        rbDigitalStorage.setText("Almacenamiento Digital");

        lblEscahe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEscahe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEscahe.setText("<html>Realizado por <a href=#>EsCaHe</a>");

        logoDinoConverter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoDinoConverter.setText("<html><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Chromium_T-Rex-error-offline.svg/144px-Chromium_T-Rex-error-offline.svg.png?20210319220015\" decoding=\"async\" width=\"60\" height=\"60\">DinoConverter");

        javax.swing.GroupLayout converterTabLayout = new javax.swing.GroupLayout(converterTab);
        converterTab.setLayout(converterTabLayout);
        converterTabLayout.setHorizontalGroup(
            converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(converterTabLayout.createSequentialGroup()
                .addGroup(converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, converterTabLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbCurrency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbTemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbDigitalStorage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(converterTabLayout.createSequentialGroup()
                                .addComponent(rbLength, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(converterTabLayout.createSequentialGroup()
                        .addGroup(converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(converterTabLayout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(btnConvert))
                            .addGroup(converterTabLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblResult)
                                    .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfResult, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(converterTabLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logoDinoConverter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lblEscahe, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        converterTabLayout.setVerticalGroup(
            converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(converterTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCurrency)
                    .addComponent(rbDigitalStorage))
                .addGap(6, 6, 6)
                .addGroup(converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTemp)
                    .addComponent(rbLength))
                .addGap(30, 30, 30)
                .addGroup(converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(txtfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResult)
                    .addComponent(txtfResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnConvert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(converterTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoDinoConverter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscahe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        mainTabbedPane.addTab("Multi-Conversor", converterTab);

        lblDescription.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDescription.setText("<html>Esta aplicación fue desarrollada por EsCaHe como una solución al primer reto Java de Alura Latam y  Oracle Next Education.");
        lblDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        logoGitHub.setText("<html><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Font_Awesome_5_brands_github.svg/800px-Font_Awesome_5_brands_github.svg.png\" \nwidth=\"52\" height=\"55\">");

        logoLinkedIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLinkedIn.setText("<html><img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/LinkedIn_Logo_%28with_%C2%AE%29.svg/1280px-LinkedIn_Logo_%28with_%C2%AE%29.svg.png\"  width=\"208\" height=\"50\">");


        javax.swing.GroupLayout aboutTabLayout = new javax.swing.GroupLayout(aboutTab);
        aboutTab.setLayout(aboutTabLayout);
        aboutTabLayout.setHorizontalGroup(
            aboutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutTabLayout.createSequentialGroup()
                .addGroup(aboutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(aboutTabLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(aboutTabLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(logoGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        aboutTabLayout.setVerticalGroup(
            aboutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutTabLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(aboutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("Información", aboutTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane)
        );

        pack();
    }


    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void txtfResultActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void txtfAmountKeyTyped(java.awt.event.KeyEvent evt) {                                    

        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        if(key == 46){
            if(!txtfAmount.getText().contains(".")){
                numeros = true;
            }
        }
        if(key == 45){
            if(!txtfAmount.getText().contains("-")){
                numeros = false;
                txtfAmount.setText("-"+txtfAmount.getText());
            }
        }

        if (!numeros)
        {
            evt.consume();
        }

        if (txtfAmount.getText().trim().length() == 15) {
            evt.consume();
        }
    }
    public void setCurrencyModel(String[] array) {
        jcbTo.setModel(new javax.swing.DefaultComboBoxModel<>(array));
        jcbTo.setSelectedIndex(2);
        jcbFrom.setModel(new javax.swing.DefaultComboBoxModel<>(array));
        jcbFrom.setSelectedIndex(0);
    }
                              

    // Variables declaration                   
    private javax.swing.JPanel aboutTab;
    public javax.swing.JButton btnConvert;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel converterTab;
    public javax.swing.JComboBox<String> jcbFrom;
    public javax.swing.JComboBox<String> jcbTo;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEscahe;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel logoDinoConverter;
    public javax.swing.JLabel logoGitHub;
    public javax.swing.JLabel logoLinkedIn;
    private javax.swing.JTabbedPane mainTabbedPane;
    public javax.swing.JRadioButton rbCurrency;
    public javax.swing.JRadioButton rbDigitalStorage;
    public javax.swing.JRadioButton rbLength;
    public javax.swing.JRadioButton rbTemp;
    public javax.swing.JTextField txtfAmount;
    public javax.swing.JTextField txtfResult;
    // End of variables declaration                   
}
