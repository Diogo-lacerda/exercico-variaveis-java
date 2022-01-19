package br.com.exercicios.desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Desafio:
Crie um programa que leia 6 valores, os quais poderão ser negativos e/ou positivos.
Em seguida, apresente a quantidade de valores positivos digitados.
Entrada
Você receberá seis valores, negativos e/ou positivos.
Saída
Exiba uma mensagem dizendo quantos valores positivos foram lidos.
Assim como é exibido abaixo no exemplo de saída.
Não se esqueça de incluir na mensagem de saída o sufixo " valores positivos".

 */
public class NumerosPositivos {
    public static void main(String[] args) throws IOException {
        String linha;
        Double n;
        int Pos, i;

        Pos=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (   int numero = 0; numero <= 5;  numero ++  ) {
            linha = br.readLine();
            n = Double.parseDouble(linha);
            if( n >= 0   )Pos++;
        }

        System.out.println("" + Pos + " valores positivos");
    }

}
