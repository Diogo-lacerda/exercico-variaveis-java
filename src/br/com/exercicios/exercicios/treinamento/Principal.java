package br.com.exercicios.exercicios.treinamento;

public class Principal {
    public static void main(String[] args) {

        AlunoMatriculado diogo = new AlunoMatriculado();
        diogo.nome = "Diogo Lacerda";
        diogo.matricula = "st54622";
        diogo.idade = "28";
        diogo.prova1 = 7;
        diogo.prova2 = 6;
        diogo.trabalho = 4;
        diogo.media();
        diogo.notaFinal();


        System.out.println("Nome: " + diogo.nome);
        System.out.println("Matricula: " + diogo.matricula);
        System.out.println("Idade: " + diogo.idade);
        System.out.println("Prova 1: " + diogo.prova1);
        System.out.println("Prova 2: " + diogo.prova2);
        System.out.println("Trabalho: " + diogo.trabalho );
        System.out.printf("Média: %.2f\n" , diogo.media() );
        System.out.printf("Restante da nota para o exame final: %.2f\n\n" , diogo.notaFinal());



        AlunoMatriculado victtor = new AlunoMatriculado();
        victtor.nome = "Victtor";
        victtor.matricula = "st54822";
        victtor.idade = "25";
        victtor.prova1 = 6;
        victtor.prova2 = 6;
        victtor.trabalho = 3;
        victtor.media();
        victtor.notaFinal();


        System.out.println("Nome: " + victtor.nome);
        System.out.println("Matricula: " + victtor.matricula);
        System.out.println("Idade: " + victtor.idade);
        System.out.println("Prova 1: " + victtor.prova1);
        System.out.println("Prova 2: " + victtor.prova2);
        System.out.println("Trabalho: " + victtor.trabalho);
        System.out.printf("Média: %.2f\n" , victtor.media());
        System.out.printf("Restante da nota para o exame final: %.2f\n " , victtor.notaFinal());


    }
}
