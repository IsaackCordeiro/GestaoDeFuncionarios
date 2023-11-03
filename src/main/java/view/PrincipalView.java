/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;

/**
 *
 * @author isaack e Douglas 
 */
public class PrincipalView extends JFrame{
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JLabel lblBemVindo;
    
    public PrincipalView(){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnVisualizar = new javax.swing.JButton();
        lblBemVindo = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Funcionários");

        btnVisualizar.setText("Visualizar");
        btnVisualizar.setMaximumSize(new java.awt.Dimension(89, 27));
        btnVisualizar.setMinimumSize(new java.awt.Dimension(89, 23));
        btnVisualizar.setPreferredSize(new java.awt.Dimension(89, 27));

        lblBemVindo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBemVindo.setText("Bem vindo à Gestão de Funcionários!");

        btnIncluir.setText("Incluir");
        btnIncluir.setMaximumSize(new java.awt.Dimension(89, 27));
        btnIncluir.setMinimumSize(new java.awt.Dimension(89, 23));
        btnIncluir.setPreferredSize(new java.awt.Dimension(89, 27));

        btnConsultar.setText("Consultar");
        btnConsultar.setPreferredSize(new java.awt.Dimension(89, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(lblBemVindo)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    public JButton getBtnConsultar() {
        return btnConsultar;
    }

    public JButton getBtnIncluir() {
        return btnIncluir;
    }

    public JButton getBtnVisualizar() {
        return btnVisualizar;
    }  
}
