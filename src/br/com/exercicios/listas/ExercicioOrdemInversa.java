package br.com.exercicios.listas;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */
public class ExercicioOrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        int count = 0;
        while (count <= (vetor.length - 1)) {
            System.out.print(vetor[count] + " \n");
            count++;
        }
        for (int i = (vetor.length - 1); i >= 0; i-- ){
            System.out.println(vetor[i] + " ");
        }
    }
}
