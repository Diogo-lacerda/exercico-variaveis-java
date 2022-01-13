package br.com.exercicios.estrutura.de.repeticao;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja invalido
e continue pedindo até que o usuário
imforme um valor válido.
 */

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println(" Nata: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Nota invalida! Digite novamente: ");
            nota = scan.nextInt();

        }


    }

}
