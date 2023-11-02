/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import model.FuncionarioCollection;
import view.ListarFuncionarioView;

/**
 *
 * @author isaac
 */
public class ListarFuncionarioPresenter{
    private ListarFuncionarioView view;
    private FuncionarioCollection collectionFuncionario ;

    public ListarFuncionarioPresenter(FuncionarioCollection collectionFuncionario) {
        this.collectionFuncionario = collectionFuncionario;
    }
    
    
    public ListarFuncionarioPresenter(){
        this.view = ListarFuncionarioView.getInstance();
        view.setVisible(true);
       
        listarFuncionarios();
        configuraTela();
    }
    
    public void listarFuncionarios(){
    collectionFuncionario = FuncionarioCollection.getInstance();
    DefaultTableModel tableModel = (DefaultTableModel)view.getTblListaFunc().getModel();
    
    if(tableModel.getRowCount() > 0){
        for (int i = 0; i <= tableModel.getRowCount()  ; i++) {
           tableModel.removeRow(0);
            System.out.println(i);
        }}
    
    for (Funcionario c : collectionFuncionario.getColaboradores()) {
       tableModel.addRow(new Object[]{c.getNome(), c.getCargo(), c.getSalarioBase()});
     }
    }
    public void configuraTela(){
        view.getBtnFechar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.dispose();
            }
        });
    }
}
