package br.com.exercicios.variaveis;

public class TiposVariaveis {

    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
//        short s2 = 40000; este valor nao pode ser usado pois o tipo te dado short so suporta ate o valor 32000 mil

//        int i1 = -10000000000;   este valor esta muito menor do que o tipo de dado int pode armazenar
        int i2 = 28500;

        long l1 = 1000000000000000000L;   //tudo numero long tem que ter um L maisculo no final
        long l2 = 2004005000500055000L;

//        float f1 = 4.5;
        float f2 = 10.68f;      // O tipo de dado float sempre deve carregar o f no final do valor que lhe foi atribuido

        double d1 = 85.69;
        double d2 = 94.04d;     // O tipo de dado double pode ser usado  o d ou nao no final do valor atribuido
//        todos os tipos de dados acima so recebem valores interiros ou seja NUMEROS

        char c1 = 'W';
//        char c2 = 'Tw';   O tipo de dado char nao pode receber mais de 1 caractere e sempre deve ser posto entre aspas simples ''
        char c3 = '\u0057';

        String st1 = "fulano";  // String sempre recebe o valor em aspas dupla ""
        String st2 = "siclano";
        String st3 = "estou com fome";

//        String dt1 = "09/02/1981";    //Data nao deve ser armazenada como string

        boolean bo1 = true;     // esse tipo de dado boolean so e usado para valores logicos o true e o false
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);




    }
}
