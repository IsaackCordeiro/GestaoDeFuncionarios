/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class FuncionarioCollection {
 private ArrayList<Funcionario> colaboradores= new ArrayList<>();;


 
 ArrayList<Funcionario> pesquisaFuncionario(String nomefuncionario){
     ArrayList<Funcionario> funcionariobuscado = new ArrayList<Funcionario>();
     for (Funcionario func : colaboradores) {
         if(nomefuncionario.equals(func.getNome())){
             funcionariobuscado.add(func);
         }
     }
      return funcionariobuscado;
 }
 
 void adicionarFuncionario(Funcionario funcionario){
     colaboradores.add(funcionario);
 }

 void editarFuncionario(int index,Funcionario func){
     colaboradores.set(index, func);
 }
 
 void removerFuncionario(int index){
     colaboradores.remove(index);
 }
 
 
 public ArrayList<Funcionario> getColaboradores() {
        return colaboradores;
    }
void pFuncionario(){
     ArrayList<Funcionario> funcionariobuscado = new ArrayList<Funcionario>();
     for (Funcionario func : colaboradores) {
         System.out.println(func.getNome());
     }
     
 }
}
