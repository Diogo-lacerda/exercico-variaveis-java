package br.com.exercicios.orientacaoobjeto.interfaces;

public class Calculadora implements OperacaoMatematica{


    @Override
    public double adicao(double valor1, double valor2) {
        return valor1 + valor2;
    }

    @Override
    public double subtracao(double valor1, double valor2) {
        return valor1 - valor2;
    }

    @Override
    public double multiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }

    @Override
    public double divisao(double valor1, double valor2) {
        return valor1 / valor2;
    }
}
