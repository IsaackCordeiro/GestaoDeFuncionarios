/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author isaack e Douglas
 */
public class FuncionarioCollection {
 private ArrayList<Funcionario> colaboradores = new ArrayList<>();
 
 private static FuncionarioCollection instance;

    public static FuncionarioCollection getInstance() {
        if(instance == null){
           instance = new FuncionarioCollection();
        }
        return instance;
    }
 
 
    private FuncionarioCollection() {
    }
 


 
 public ArrayList<Funcionario> pesquisaFuncionario(String nomefuncionario){
     ArrayList<Funcionario> funcionariobuscado = new ArrayList<Funcionario>();
     for (Funcionario func : colaboradores) {
         if(nomefuncionario.toUpperCase().contains(func.getNome().toUpperCase())){
             funcionariobuscado.add(func);
         }
     }
      return funcionariobuscado;
 }
 
 public void adicionarFuncionario(Funcionario funcionario){
     colaboradores.add(funcionario);
 }

 public void editarFuncionario(int index,Funcionario func){
     colaboradores.set(index, func);
 }
 
 public void removerFuncionario(int index){
     colaboradores.remove(index);
 }
 
 
 public ArrayList<Funcionario> getColaboradores() {
        return colaboradores;
    }
public void pFuncionario(){
     ArrayList<Funcionario> funcionariobuscado = new ArrayList<Funcionario>();
     for (Funcionario func : colaboradores) {
         System.out.println(func.getNome());
     }
     
 }
}
