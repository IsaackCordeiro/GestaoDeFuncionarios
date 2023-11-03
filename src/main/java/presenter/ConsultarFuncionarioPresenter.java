/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import model.FuncionarioCollection;
import view.ConsultarFuncionarioView;

/**
 *
 * @author isaack e Douglas
 */
public class ConsultarFuncionarioPresenter {

    private ConsultarFuncionarioView view;
    private FuncionarioCollection colaborabores;

    public ConsultarFuncionarioPresenter() {
        this.view = ConsultarFuncionarioView.getInstance();
        view.setVisible(true);
        configuraTela();
    }

    public void listarFuncionarios() {
        colaborabores = FuncionarioCollection.getInstance();
        String atributo = view.getTxtAtributoPesquisa().getText();
        DefaultTableModel tableModel = (DefaultTableModel) view.getTbResultadoPesquisa().getModel();

        if (tableModel.getRowCount() > 0) {
            while (tableModel.getRowCount() != 0) {
                tableModel.removeRow(0);
            }
        }

        for (Funcionario c : colaborabores.pesquisaFuncionario(atributo)) {
            tableModel.addRow(new Object[]{c.getNome(), c.getCargo(), c.getSalarioBase()});
        }

    }

    public void configuraTela() {
        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
            }
        });
        view.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarFuncionarios();
            }
        });
    }
}
