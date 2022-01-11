package br.com.exercicios.metodos;

import javax.swing.*;
/*
Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
 */
class PrimeiroExercico {
    public static void main(String[] args) {

        int valorA = 30;
        int valorB = 10;
        somar(valorA, valorB);// Chamando o método somar e passando dois valores
        subtrair(valorA, valorB); // Chamando o método subtrair e passando dois valores
        dividir(valorA, valorB); // Chamando o método dividir e passando dois valores
        multiplicar(valorA, valorB); // Chamando o método multiplicar e passando dois valores
    }

    private static void multiplicar(int valorA, int valorB) {
        int resultadoDaMultiplicacao = valorA * valorB;
        System.out.println("Resultado da multiplicação = " + resultadoDaMultiplicacao);
    }

    private static void dividir(int valorA, int valorB) {
        int resultadoDaDivisao = valorA / valorB;
        System.out.println("Resultado da divisão = " + resultadoDaDivisao);
    }

    private static void subtrair(int valorA, int valorB) {
        int resultadoDaSubtracao = valorA - valorB;
        System.out.println("Resultado da Subtração = " + resultadoDaSubtracao);
    }

    private static void somar(int valorA, int valorB) {
        int resultadoDaSoma = valorA + valorB;
        System.out.println("Resultado da Soma = " + resultadoDaSoma);
    }
}

