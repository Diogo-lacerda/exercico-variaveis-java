package br.com.exercicios.variaveis;

import javax.swing.*;

public class TerceiroExercicio {

    public static void main(String[] args) {

        System.out.println("PrePos\n");
        prePos();
        System.out.println("Aritmético\n");
        aritmetico();
        System.out.println("atribuição\n");
        atribuicao();
        System.out.println("precedência\n");
        precedencia();

    }

    private static void precedencia() {
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;
        //10+(19*30) = 10+570=580
        System.out.println("O valor de a = " + a);
        System.out.println("O valor de i = " + i);
        System.out.println("O valor de j = " + j);

        int b = k / --i % 3 + 1;
        // 30 / 10 restante da divisão / 3 + 1
        // 3 / 3 restante = 0 + 1 = 1
        System.out.println("O valor de b = " + b);
        System.out.println("O valor de i = " + i);

        int c = 2;
        c *= (i += 5);
        // 10+=5 => 10+5 = 15 então i=15
        // c *=15 => 2*15 = 30 então c=30
        System.out.println("O valor de i = " + i);
        System.out.println("O valor de c = " + c);

    }

    private static void atribuicao() {
        int i = 1500;
        short j = 15;
        long l = 500;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("valor de d = " + d);

        i += 5; // é o mesmo que i = i+5
        j -= 3; // é o mesmo que j = j-3
        d /= 2.7; // è o mesmo que d = d /2.7
        l *= 3; // è o mesmo que l = l *3
        k %= 2; // é o mesmo que a sobra da divisão de k que vale 35 / 2

        System.out.println("O valor i = " + i);
        System.out.println("O valor j = " + j);
        System.out.println("O valor d = " + d);
        System.out.println("O valor l = " + l);
        System.out.println("O valor k = " + k);

    }

    private static void aritmetico() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println("A soma de a+b = " + r1);
        System.out.println("A subtração de c-a = " + r2);
        System.out.println("A multiplicação de d*b = " + r3);
        System.out.println("A divisão de e/a = " + r4);
        System.out.println("restante da divisão c e b = " + r5 + "\n");
    }

    private static void prePos() {
        int k = 10;
        System.out.println("Sou o valor inicial: K = " + k);
        int i = ++k;    // quando atribuição for o ++ significa que sera somado mais 1 no valor que foi atribuido
        System.out.println("Sou o valor depois do I : K = " + k);
        int j = k--;   //
        System.out.println("Sou o valor depois do J : K = " + k);
        System.out.println("Sou o Valor de j = " + j + "\n");

    }
}

