/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.PrincipalView;

/**
 *
 * @author isaac
 */
public class PrincipalPresenter {
    private PrincipalView view;
    
    public PrincipalPresenter(){
        this.view = new PrincipalView();
        view.setVisible(true);
        
        configuraTela();
    }
    
    public void configuraTela(){
        view.getBtnConsultar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ConsultarFuncionarioPresenter consultarFuncionarioPresenter = new ConsultarFuncionarioPresenter();
            }
        });
    }
}
