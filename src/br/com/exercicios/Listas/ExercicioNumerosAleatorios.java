package br.com.exercicios.Listas;

import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatórios
(entre 0 e 100) armazene-os num vetor.
Ao final mostre os números é seus sucessores.
 */
public class ExercicioNumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++ ) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");

        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}
