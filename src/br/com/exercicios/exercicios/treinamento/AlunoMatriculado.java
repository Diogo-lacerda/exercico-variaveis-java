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
    String nome;
    String matricula;
    String idade;
    double prova1;
    double prova2;
    double trabalho;

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

















    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String aluno = "Diogo Lacerda";
        String matricula = "FC20172679";
        System.out.println("Aluno: " + aluno + "\nMatricula: " + matricula);
        System.out.println("Boletim do primeiro semestre");

        double prova1 ;
        System.out.println("Nota 1º Prova: ");
        prova1 = scan.nextDouble();
        double prova2;
        System.out.println("Nota 2º Prova: ");
        prova2 = scan.nextDouble();
        double trabalho;
        System.out.println("Nota Trabalho: ");
        trabalho = scan.nextDouble();
        double notafinal = 3;

        double media = (prova1 + prova2 + trabalho) / 2;
        System.out.println("Média: " + media);
        if (media >= notafinal){
            System.out.println("Você passou");
       }
       else {
           System.out.println("Você esta de exame final");
        }

    }

}
