/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolaprojetopoomayrton;

/**
 *
 * @author israel.brito
 */
public class Pessoa {
    protected String nome;
    protected int idade;
    protected String matricula;
    protected String login;
    protected String senha;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa(String nome, int idade, String login, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.login = login;
        this.senha = senha;
        this.matricula = "FR0000";
    }
    
   
    
}
