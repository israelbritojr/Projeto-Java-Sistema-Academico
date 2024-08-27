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
/*Professor vai extender de uma pessoa logo usamos o comando extends*/
public class Professor extends Pessoa{
    LinkedList<String> disciplinas;
 
    public Professor(String nome, int idade, String login, String senha) {
        /* o comando "super" está chamando o construtor da classe mãe*/
        super(nome, idade, login, senha);
        this.disciplinas = new LinkedList<String>();
    }
    
    public LinkedList<String> getDisciplinas(){
        return disciplinas;
    }

    public void setDisciplinas(LinkedList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    @Override
    public String toString(){
        return "\nNome: " + super.getNome() + 
                "\nMatricula: " + super.getMatricula() + 
                "\nIdade: " + super.getIdade() + 
                "\nLogin: " +  super.getLogin() + 
                "\nSenha: " + super.getSenha() + 
                "\nLista Disciplinas: ";
    }
}