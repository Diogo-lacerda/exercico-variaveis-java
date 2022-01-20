package br.com.exercicios.exercicios.treinamento;

public class Principal {
    public static void main(String[] args) {

        AlunoMatriculado diogo = new AlunoMatriculado();
        diogo.setNome("Diogo Lacerda");
        diogo.setMatricula("st54622");
        diogo.setIdade(28);
        diogo.setProva1(10);
        diogo.setProva2(6);
        diogo.setTrabalho(4);
        diogo.media();
        diogo.notaFinal();


        System.out.println("Nome: " + diogo.getNome());
        System.out.println("Matricula: " + diogo.getMatricula());
        System.out.println("Idade: " + diogo.getIdade());
        System.out.println("Prova 1: " + diogo.getProva1());
        System.out.println("Prova 2: " + diogo.getProva2());
        System.out.println("Trabalho: " + diogo.getTrabalho() );
        System.out.printf("Média: %.2f\n" , diogo.media() );
        System.out.printf("Restante da nota para o exame final: %.2f\n\n" , diogo.notaFinal());



        AlunoMatriculado victtor = new AlunoMatriculado();
        victtor.setNome("Victtor");
        victtor.setMatricula("st54822");
        victtor.setIdade(25);
        victtor.setProva1(8);
        victtor.setProva2(9);
        victtor.setTrabalho(6);
        victtor.media();
        victtor.notaFinal();


        System.out.println("Nome: " + victtor.getNome());
        System.out.println("Matricula: " + victtor.getMatricula());
        System.out.println("Idade: " + victtor.getIdade());
        System.out.println("Prova 1: " + victtor.getProva1());
        System.out.println("Prova 2: " + victtor.getProva2());
        System.out.println("Trabalho: " + victtor.getTrabalho());
        System.out.printf("Média: %.2f\n" , victtor.media());
        System.out.printf("Restante da nota para o exame final: %.2f\n " , victtor.notaFinal());


    }
}
