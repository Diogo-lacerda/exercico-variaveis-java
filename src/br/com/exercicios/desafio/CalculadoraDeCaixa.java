package br.com.exercicios.desafio;

import java.util.Scanner;

/*
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.
Saída
O arquivo de saída deve conter a mensagem "Total: R$" seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

 */
public class CalculadoraDeCaixa {
    public static void main(String[] args) {
        int codigo, quantidade;
        float preco = 0;

        Scanner input = new Scanner(System.in);
        codigo = input.nextInt();
        quantidade = input.nextInt();
        if (codigo == 1) {
            preco  = (float) (4.00 * quantidade);
        }else if (codigo == 2) {
            preco  = (float) ( 3.00 * quantidade);  //implemente sua lógica aqui
        }else if (codigo == 3) {
            preco  = (float) ( 2.00 * quantidade    );  //implemente sua lógica aqui
        }else if (codigo == 4) {
            preco  = (float) ( 1.99 * quantidade    ); //implemente sua lógica aqui
        }else if (codigo == 5) {
            preco  = (float) ( 8.45 * quantidade   ); //implemente sua lógica aqui
        }

        System.out.printf("Total: R$ %.2f\n",preco);
    }

}
