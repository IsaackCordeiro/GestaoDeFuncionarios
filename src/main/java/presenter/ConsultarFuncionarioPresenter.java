/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import javax.swing.*;
import view.ConsultarFuncionarioView;
import view.PrincipalView;

/**
 *
 * @author isaac
 */
public class ConsultarFuncionarioPresenter extends JFrame{
     private ConsultarFuncionarioView view;
    public ConsultarFuncionarioPresenter(){
        iniciarComponente();
    }
    public void iniciarComponente(){
    this.view = new ConsultarFuncionarioView();
        view.setVisible(true);
    }
    
}
