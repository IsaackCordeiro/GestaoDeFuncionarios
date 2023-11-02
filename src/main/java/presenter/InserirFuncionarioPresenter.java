/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import model.Funcionario;
import model.FuncionarioCollection;
import view.InserirFuncionarioView;
import javax.swing.JOptionPane;

/**
 *
 * @author isaack e Douglas
 */
public class InserirFuncionarioPresenter {

    private InserirFuncionarioView view;
    private FuncionarioCollection colaborabores;
    private Funcionario funcionario;

    public InserirFuncionarioPresenter() {
        this.view = InserirFuncionarioView.getInstace();
        view.setVisible(true);
        configuraTela();
    }

    public void configuraTela() {

        view.getBtnCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
            }
        });

        view.getBtnSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validaCampos()){
                    String nome = view.getTxtNome().getText();
                    String cargo = view.getTxtCargo().getText();
                    double salario = Double.parseDouble(view.getTxtSalarioBase().getText());

                    funcionario = new Funcionario(nome, cargo, salario);
                    colaborabores = FuncionarioCollection.getInstance();
                    colaborabores.adicionarFuncionario(funcionario);
                    
                    limparFormulario();
                } 
            }
        });
        
        view.getTxtSalarioBase().addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                // Este método é chamado quando uma tecla é digitada.
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    // Se o caractere não for um dígito, bloqueie a entrada.
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }

    private void limparFormulario() {
        view.getTxtNome().setText("");
        view.getTxtCargo().setText("");
        view.getTxtSalarioBase().setText("");
    }
    
    private boolean validaCampos(){
        if(view.getTxtNome().getText().isBlank()){
            JOptionPane.showMessageDialog(view, "Por favor, insira o nome");
            view.getTxtNome().requestFocus();
            return false;
        } else if(view.getTxtCargo().getText().isBlank()){
            JOptionPane.showMessageDialog(view, "Por favor, insira o cargo");
            view.getTxtCargo().requestFocus();
            return false;
        } else if(view.getTxtSalarioBase().getText().isBlank()){
            JOptionPane.showMessageDialog(view, "Por favor, insira o salário");
            view.getTxtSalarioBase().requestFocus();
            return false;
        } else {
            JOptionPane.showMessageDialog(view,
                        "Funcionario : " + view.getTxtNome().getText() + "\nCargo : " + view.getTxtCargo().getText() + "\nSalário : " + Double.parseDouble(view.getTxtSalarioBase().getText()),
                         "Cadastro completo",
                        JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
    
}
