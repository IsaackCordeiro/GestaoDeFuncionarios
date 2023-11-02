/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author isaack e Douglas
 */
public class ConsultarFuncionarioView extends JFrame{
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JComboBox<String> cbbParametroPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbResultadoPesquisa;
    private javax.swing.JTextField txtAtributoPesquisa;
    
    private static ConsultarFuncionarioView instance;
    

    private ConsultarFuncionarioView() {
        initComponents();
    }
    
    public static ConsultarFuncionarioView getInstance() {
        if (instance == null) {
            instance = new ConsultarFuncionarioView();
        }
        return instance;
    }
    
    
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        cbbParametroPesquisa = new javax.swing.JComboBox<>();
        txtAtributoPesquisa = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResultadoPesquisa = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbbParametroPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Cargo", "Salario Base" }));

        btnBuscar.setText("Buscar");

        tbResultadoPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cargo", "Salário Base"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbResultadoPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbResultadoPesquisa.setRowSelectionAllowed(false);
        tbResultadoPesquisa.getTableHeader().setResizingAllowed(false);
        tbResultadoPesquisa.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbResultadoPesquisa);

        btnNovo.setText("Novo");
        btnNovo.setToolTipText("");

        btnVisualizar.setText("Visualizar");

        btnFechar.setText("Fechar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cbbParametroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAtributoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVisualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar)
                        .addContainerGap(128, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbParametroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtributoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnVisualizar)
                    .addComponent(btnFechar))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
// </editor-fold>                        

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }

    public JButton getBtnNovo() {
        return btnNovo;
    }

    public JButton getBtnVisualizar() {
        return btnVisualizar;
    }

    public JComboBox<String> getCbbParametroPesquisa() {
        return cbbParametroPesquisa;
    }

    public JTextField getTxtAtributoPesquisa() {
        return txtAtributoPesquisa;
    }

    public JTable getTbResultadoPesquisa() {
        return tbResultadoPesquisa;
    }
    
    
}
