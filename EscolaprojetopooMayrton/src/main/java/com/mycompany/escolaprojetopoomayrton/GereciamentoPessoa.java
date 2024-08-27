/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolaprojetopoomayrton;

import java.util.LinkedList;

/**
 *
 * @author israel.brito
 */
public class GereciamentoPessoa {
    
    LinkedList<Pessoa> pessoas;
    
    public GereciamentoPessoa(){
        this.pessoas = new LinkedList<Pessoa>();
    }
    
    public void cadastrarPessoa(Pessoa p){
        this.pessoas.add(p);
    }
    
    public void imprimirPessoas(){
        for (Pessoa p: this.pessoas){
            System.out.println(p.toString());
        }
    }
}
