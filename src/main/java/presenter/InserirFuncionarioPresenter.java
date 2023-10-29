/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.InserirFuncionarioView;

/**
 *
 * @author isaac
 */
public class InserirFuncionarioPresenter{
    private InserirFuncionarioView view ;
    public InserirFuncionarioPresenter(){
        this.view = InserirFuncionarioView.getInstace();
        view.setVisible(true);
        configuraTela();
    }
    
    public void configuraTela(){
        
        view.getBtnCancelar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.dispose();
            }
        });
    }
}
