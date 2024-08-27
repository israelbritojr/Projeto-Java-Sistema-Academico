/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escolaprojetopoomayrton;

import javax.swing.JOptionPane;

/**
 *
 * @author israel.brito
 */
public class EscolaprojetopooMayrton {
        public static void main(String[] args) {  
            
        GereciamentoPessoa gp = new GereciamentoPessoa();
        
        Pessoa a1 = new Aluno("Pedro", 18, "Pedro", "123", "ADS");
        gp.cadastrarPessoa(a1);
        Pessoa a2 = new Aluno("Joao", 39, "Joao", "123", "ADS");
        gp.cadastrarPessoa(a2);
        Pessoa p1 = new Professor("Matheus", 41, "ProfMatheus", "145");
        gp.cadastrarPessoa(p1);
        Pessoa p2 = new Professor("Carlos", 44, "ProfOliveira", "145");
        gp.cadastrarPessoa(p2);
        gp.imprimirPessoas();
        Pessoa p3 = new Professor ("Joana", 34, "ProfJoana", "123");
        gp.cadastrarPessoa(p3);
        gp.imprimirPessoas();
       
        String login, senha;
        do{
           login = JOptionPane.showInputDialog("Digite seu login: ");
           senha = JOptionPane.showInputDialog("Digite a senha: ");
        }while(!login.equalsIgnoreCase("adm") || !senha.equals("123"));
       
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Sistema!");
            

            
        /* Aluno a = new Aluno("",25,"ADS");
        Aluno b = new Aluno("",30,"ADS");
        
        String nomeAluno = JOptionPane.showInputDialog("Digite seu nome: ");
        a.setNome(nomeAluno);
        
        double nomeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite média: "));
        a.setMedia(nomeMedia);
        System.out.println("Nome do aluno: " + a.getNome());
        System.out.println("Média do aluno: " + a.getMedia());
        System.out.println("Curso do aluno: " + a.getCurso());
        System.out.println("Idade do aluno: " + a.getIdade());
        System.out.println("Matricula do aluno: " + a.getMatricula());
        System.out.println("ALUNO B\nNome do aluno: " + b.getNome());
        System.out.println("Média do aluno: " + b.getMedia());
        System.out.println("Curso do aluno: " + b.getCurso());
        System.out.println("Idade do aluno: " + b.getIdade());
        System.out.println("Matricula do aluno: " + b.getMatricula());
     */
        
     }
}
