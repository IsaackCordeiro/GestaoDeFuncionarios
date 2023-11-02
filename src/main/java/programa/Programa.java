/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import model.Funcionario;
import model.FuncionarioCollection;
import presenter.PrincipalPresenter;

/**
 *
 * @author isaac
 */
public class Programa {
    public static void main(String[] args) {
        
        /*System.out.println("Testando");
        //
        Funcionario f1 = new Funcionario("douglas","estágiario",2000);
        Funcionario f2 = new Funcionario("thiago","CTO",200000);
        Funcionario f3 = new Funcionario("isaack","Senior",20000);
        //
        FuncionarioCollection func = FuncionarioCollection.getInstance();
        
        func.adicionarFuncionario(f1);
        func.adicionarFuncionario(f2);
        func.adicionarFuncionario(f3);
        System.out.println("Test1");
        func.pFuncionario();
        System.out.println("Test2");
        func.editarFuncionario(0, f2);
        func.pFuncionario();
        func.removerFuncionario(0);
        System.out.println("Test3");
        func.pFuncionario();*/
        PrincipalPresenter principalPresenter = new PrincipalPresenter();
    }
}
