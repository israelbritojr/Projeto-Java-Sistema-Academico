/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolaprojetopoomayrton;

/**
 *
 * @author israel.brito
 */
public class Aluno extends Pessoa{
    private String curso = "";
    private double media = 0;
    
    public double getMedia(){
        return this.media;
    }
    
    public double setMedia(double media){
        if ((media>=0) && (media<=10)){
            this.media = media;
        }else{
            System.out.println("A média é invalida!");
        }
        return 0;
    }
    
    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    

    public Aluno(String nome, int idade, String login, String senha, String curso) {
        super(nome, idade, login, senha);
        this.media = 0;
        this.curso = curso;
    }
    
    

    @Override
    public String toString(){
        return "\nNome: " + super.getNome() + 
               "\nIdade: " + super.getIdade() + 
               "\nMatrícula: " + super.getMatricula() + 
               "\nMedia: " + this.getMedia() + 
               "\nCurso: " + this.getCurso();
    }
}
