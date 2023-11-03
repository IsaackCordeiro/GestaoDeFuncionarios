/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;

/**
 *
 * @author isaac
 */
public class VisualizarFuncionarioView extends JFrame {

    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSalarioBase;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalarioBase;

    private static VisualizarFuncionarioView instance;

    private VisualizarFuncionarioView() {
        initComponents();
    }

    public static VisualizarFuncionarioView getInstance() {
        if (instance == null) {
            instance = new VisualizarFuncionarioView();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lbNome = new javax.swing.JLabel();
        lbCargo = new javax.swing.JLabel();
        lbSalarioBase = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtSalarioBase = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar Funcionário");
        setResizable(false);

        lbNome.setText("Nome:");

        lbCargo.setText("Cargo");

        lbSalarioBase.setText("Salario Base:");

        txtNome.setEditable(false);

        txtCargo.setEditable(false);

        txtSalarioBase.setEditable(false);

        btnFechar.setText("Fechar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbSalarioBase)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtSalarioBase, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbNome)
                                                        .addComponent(lbCargo))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtCargo)
                                                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))))
                                .addContainerGap(56, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFechar)
                                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbNome)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbCargo)
                                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbSalarioBase))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(btnFechar)
                                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }

    public JTextField getTxtCargo() {
        return txtCargo;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public JTextField getTxtSalarioBase() {
        return txtSalarioBase;
    }
}
