package br.com.exercicios.operadores.relacionas;

public class OperadoresRelacionais {
    /**
     * Os operadores relacionais são < maior que, > menor que, == igual, >= menor ou igual, <= maior ou igual
     * != diferente de, true => verdadeiro ou false
     */
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 5.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "fulano";
        String s2 = "fulano";
        String s3 = "ciclano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597l;
        long l2 = 8797l;
        byte y1 = 1;
        short h1 = 25;

        boolean igual = i1 == i2;
        boolean diferente = i1 != i2;
        boolean maior = i1 > i2;
        boolean menorOuIgual = i1 <= i2;

        System.out.println("i1 e igual a i2 " + igual);
        System.out.println("i1 e difente a i2 " + diferente);
        System.out.println("i1 e maior que i2 " + maior);
        System.out.println("i1 e menor ou igual a i2 " + menorOuIgual + "\n");


        igual = f1 == f2;
        diferente = f1 != f2;
        maior = f1 > f2;
        menorOuIgual = f1 <= f2;

        System.out.println("f1 e igual a f2 " + igual);
        System.out.println("f1 e diferente a f2 " + diferente);
        System.out.println("f1 e maior que f2 " + maior);
        System.out.println("f1 e menor ou igual a f2 " + menorOuIgual + "\n");


        igual = c1 == c2;
        diferente = c1 != c2;
        maior = c1 > c2;
        menorOuIgual = c1 <= c2;

        System.out.println("c1 e igual a c2 " + igual);
        System.out.println("c1 e diferente a c2 " + diferente);
        System.out.println("c1 e maior que c2 " + maior);
        System.out.println("c1 e menor ou igual a c2 " + menorOuIgual + "\n");


        igual = s1 == s2;
        diferente = s1 != s3;
        boolean desigual = s1 != s2;
//        maior = s1 > s2;
//        menorOuIgual = s1 >= s2; esse código nao ira funcionar, pois o s1 e s2 não são números são Strings


        System.out.println("s1 e igual a s2 " + igual);
        System.out.println("s1 e igual a s2 " + diferente);
        System.out.println("c1 e igual a c2 " + desigual + "\n");
//        System.out.println("c1 e igual a c2 " + maior);
//        System.out.println("c1 e igual a c2 " + menorOuIgual);


        igual = b1 == b2;
        diferente = b1 != b2;
 //       maior = b1 > b2;
 //       menorOuIgual = b1 <= b2; esse código nao ira funcionar, pois o b1 e b2 não são números são Strings

        System.out.println("b1 e igual a b2 " + igual);
        System.out.println("b1 e diferente de b2 " + diferente + "\n");
 //       System.out.println("b1 e maior que b2 " + maior);
 //       System.out.println("b1 e menor ou igual a b2 " + menorOuIgual + "\n");








    }
}
