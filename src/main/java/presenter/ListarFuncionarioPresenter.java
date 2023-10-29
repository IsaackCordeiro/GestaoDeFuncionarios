/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ListarFuncionarioView;

/**
 *
 * @author isaac
 */
public class ListarFuncionarioPresenter{
    private ListarFuncionarioView view;
    
    public ListarFuncionarioPresenter(){
        this.view = ListarFuncionarioView.getInstance();
        view.setVisible(true);
        
        configuraTela();
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
