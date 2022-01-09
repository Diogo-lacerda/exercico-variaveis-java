package br.com.exercicios.variaveis;

public class QuartoExercicio {
    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;
        System.out.println("O valor de b1 " + b1);
        System.out.println("O valor de s1 " + s1 + "\n");

        long l1;
        int i1 = 10; // quando os tipos de variaveis forem mudado do menor para o maior nao precisa fazer o cast
        l1 = i1;        // so e feito o cast quando e do maior para o menor ex: long vai vira int.
        System.out.println("O valor de l1 = " + l1);
        System.out.println("O valor de i1 = " + i1 + "\n");

        int i2 ;
        long l2 = 1000000000000000000L;
        i2 = (int) l2; // nem todos cast vao trazer os numeros que foram alocados, quando um long com 19 casas decimais
        // e obrigado a fazer um cast para um int que so cabe 10 casas decimais ele nao ira aparece o valor correto.
        System.out.println("O valor de i2 = " + i2);
        System.out.println("O valor de l2 = " + l2 + "\n");

        double d1;
        float f1 = 10.5f;

        d1 = f1;
        System.out.println(" O valor de f1 = " + f1);
        System.out.println(" O valor de d1 = " + d1 + "\n");

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;
        System.out.println(" O valor de i4 = " + i4);
        System.out.println(" O valor de f4 = " + f4 + "\n");









    }
}
