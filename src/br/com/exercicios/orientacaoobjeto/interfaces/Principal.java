package br.com.exercicios.orientacaoobjeto.interfaces;

public class Principal {
    public static void main(String[] args) {
        OperacaoMatematica operacao = new Calculadora();


        double soma = operacao.adicao(45, 33);
        double subtracao = operacao.subtracao(155, 93);
        double multiplicao = operacao.multiplicacao(35, 12);
        double divisao = operacao.divisao(272, 14);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicao);
        System.out.println("Divisão: " + divisao);

    }
}
