/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import model.FuncionarioCollection;
import view.ConsultarFuncionarioView;
import view.VisualizarFuncionarioView;

/**
 *
 * @author isaack e Douglas
 */
public class ConsultarFuncionarioPresenter {

    private ConsultarFuncionarioView view;
    private VisualizarFuncionarioView visualizarFuncionarioView;
    private FuncionarioCollection colaborabores;
    private ArrayList<Funcionario> funcionarioEncontrados;

    public ConsultarFuncionarioPresenter() {
        this.view = ConsultarFuncionarioView.getInstance();
        view.setVisible(true);
        view.getBtnVisualizar().setEnabled(false);
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

        funcionarioEncontrados = colaborabores.pesquisaFuncionario(atributo);
        for (Funcionario c : funcionarioEncontrados) {
            tableModel.addRow(new Object[]{c.getNome(), c.getCargo(), c.getSalarioBase()});
        }

    }

    public void configuraTela() {
        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel tableModel = (DefaultTableModel) view.getTbResultadoPesquisa().getModel();

                if (tableModel.getRowCount() > 0) {
                    while (tableModel.getRowCount() != 0) {
                        tableModel.removeRow(0);
                    }
                }

                view.dispose();
            }
        });
        view.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarFuncionarios();
            }
        });
        view.getTbResultadoPesquisa().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    if (view.getTbResultadoPesquisa().getSelectedRow() != -1) {
                        view.getBtnVisualizar().setEnabled(true);
                    } else {
                        view.getBtnVisualizar().setEnabled(false);
                    }
                }
            }
        });
        view.getBtnVisualizar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizarFuncionarioView = VisualizarFuncionarioView.getInstance();
                visualizarFuncionarioView.setVisible(true);

                int posFuncionarioSelecionado = view.getTbResultadoPesquisa().getSelectedRow();
                Funcionario funcionarioSelecionado = funcionarioEncontrados.get(posFuncionarioSelecionado);

                visualizarFuncionarioView.getTxtNome().setText(funcionarioSelecionado.getNome());
                visualizarFuncionarioView.getTxtCargo().setText(funcionarioSelecionado.getCargo());
                visualizarFuncionarioView.getTxtSalarioBase().setText(Double.toString(funcionarioSelecionado.getSalarioBase()));

                visualizarFuncionarioView.getBtnFechar().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        visualizarFuncionarioView.dispose();
                    }
                });
            }
        });
    }
}
