package br.com.exercicios.exercicios.treinamento;

public class Calendario {
    public static void main(String[] args) {
        Data calendario = new Data(31,11,2022,"dezembro");
        Data calendarioAtual = new Data(3,12,2022,"março");


        System.out.println("Exibir a Data :" + calendario.imprimiData());
        System.out.println(calendario.compara(calendarioAtual));
    }
}
