/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ConsultarFuncionarioView;

/**
 *
 * @author isaac
 */
public class ConsultarFuncionarioPresenter {
    private ConsultarFuncionarioView view;
    
    public ConsultarFuncionarioPresenter(){
        this.view = new ConsultarFuncionarioView();
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
