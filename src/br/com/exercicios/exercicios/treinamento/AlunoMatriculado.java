package br.com.exercicios.exercicios.treinamento;

import java.util.Scanner;

/*
Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto
dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de
trabalho. Escreva os seguintes métodos para esta classe:

media calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
final calcula quanto o aluno precisa para a prova final, (retorna zero se ele não for para a final)
 */
public class AlunoMatriculado {
    private String nome;
    private String matricula;
    private int idade;
    private double prova1;
    private double prova2;
    private double trabalho;

    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
      this.nome = nome;
    }
    public double getProva1(){
        return prova1;
    }
    public void setProva1(double prova1){
        if ( prova1 >= 0 && prova1 <= 10){
            this.prova1 = prova1;
        }
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public double getProva2(){
        return prova2;
    }
    public void setProva2(double prova2){
        if ( prova2 >= 0 && prova2 <= 10){
            this.prova2 = prova2;
        }
    }
    public double getTrabalho(){
        return trabalho;
    }
    public void setTrabalho(double trabalho) {
        if (trabalho >= 0 && trabalho <= 10) {
            this.trabalho = trabalho;
        }
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if (idade >= 1){
            this.idade = idade;
        }
    }

        public double media (){
        return (prova1 + prova2 + trabalho) /3;
    }
    public double notaFinal (){
      double media = media();
        if (media >= 7){
            return 0;
        }
        else {
            return 7 - media;
        }
    }


}
