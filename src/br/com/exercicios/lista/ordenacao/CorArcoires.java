package br.com.exercicios.lista.ordenacao;


import java.util.*;

public class CorArcoires {
    public static void main(String[] args) {
        Set<Cor> tipoCor = new HashSet<>();

        tipoCor.add(new Cor("vermelho"));
        tipoCor.add(new Cor("verde"));
        tipoCor.add(new Cor("amarelo"));
        tipoCor.add(new Cor("azul"));
        tipoCor.add(new Cor("rosa"));
        tipoCor.add(new Cor("laranja"));
        tipoCor.add(new Cor("roxo"));

        System.out.println("Lista Cores do Arco-íris \n");
        for (Cor cor : tipoCor) {
            System.out.println("Cor: " + cor.getNomeCor());
        }
        System.out.println("\nQuantidade de Cores e: " + tipoCor.size());

        System.out.println("\nCores por Ordem Alfabética");
        tipoCor.stream().sorted().forEach(cor -> System.out.println("Cor: " + cor.getNomeCor()));

        List<Cor> cores = new ArrayList<>(tipoCor);
        System.out.println("\nLista Ordem Inversa");
        for (int i = cores.size() - 1; i >= 0; i--) {
            System.out.println("Cor: " +cores.get(i).getNomeCor());
        }

        System.out.println("\nImprimindo as Cores com a Letra (V)");
        for (Cor cor : tipoCor) {
            if (cor.getNomeCor().startsWith("v")){
                System.out.println("Cor: " + cor.getNomeCor());
            }

        }

        System.out.println("\nRemovedo as Cores que não Começam com a Letra (V)");
        List<Cor>coresRemover = new ArrayList<>();
        for (Cor cor : tipoCor) {
            if(!cor.getNomeCor().startsWith("v")) {
                coresRemover.add(cor);
            }
        }
        //tipoCor.removeIf(cor -> !cor.getNomeCor().startsWith("v")); pode ser feito assim tbm.
        tipoCor.removeAll(coresRemover);
        for (Cor cor : tipoCor) {
            System.out.println("Cor; " + cor.getNomeCor());
        }

        System.out.println("\nRemovendo Todas as Cores da Lista");
        tipoCor.removeIf(cor -> true);
        System.out.println("Cor: " + tipoCor );

    }

}
