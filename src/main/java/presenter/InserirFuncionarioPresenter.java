/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Funcionario;
import model.FuncionarioCollection;
import view.InserirFuncionarioView;

/**
 *
 * @author isaac
 */
public class InserirFuncionarioPresenter{
    private InserirFuncionarioView view ;
    private FuncionarioCollection colaborabores;
    private Funcionario funcionario; 
    
    
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
        
        view.getBtnSalvar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nome = view.getTxtNome().getText();
                String cargo = view.getTxtCargo().getText();
                double salario = Double.parseDouble(view.getTxtSalarioBase().getText());
                funcionario = new Funcionario(nome,cargo,salario);
                colaborabores = FuncionarioCollection.getInstance();
                colaborabores.adicionarFuncionario(funcionario);
                limparFormulario();
            }
        });
    }
    
    private void limparFormulario(){
     view.getTxtNome().setText("");
     view.getTxtCargo().setText("");
     view.getTxtSalarioBase().setText("");
     }
}
