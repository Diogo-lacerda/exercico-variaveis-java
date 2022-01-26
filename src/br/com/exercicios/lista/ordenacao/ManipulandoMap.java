package br.com.exercicios.lista.ordenacao;

import java.util.HashMap;
import java.util.Map;

public class ManipulandoMap {
    public static void main(String[] args) {
        Map<String, Integer> estadosPopulacao = new HashMap<>();
        estadosPopulacao.put("Pernanbuco", 9616621);
        estadosPopulacao.put("Alagoas", 3351543);
        estadosPopulacao.put("Ceara", 9187103);
        estadosPopulacao.put("Rio Grande Norte", 3534265);

        System.out.println("Senso Populacional dos Estados BR\n");
        for (String chave : estadosPopulacao.keySet()) {
            System.out.println("Estado: " + chave + " \tPopulação: " + estadosPopulacao.get(chave));
        }

        System.out.println("\nSenso Populacional dos Estados BR\n");
        estadosPopulacao.put("Pernanbuco", 3534165);
        for (String chave : estadosPopulacao.keySet()) {
            System.out.println("Estado: " + chave + " \tPopulação: " + estadosPopulacao.get(chave));
        }

        System.out.println("\nSenso Populacional dos Estados BR\n");
        if (!estadosPopulacao.containsKey("Paraiba")) {
            estadosPopulacao.put("Paraiba", 4039277);
        }
        for (String chave : estadosPopulacao.keySet()) {
            System.out.println("Estado: " + chave + " \tPopulação: " + estadosPopulacao.get(chave));
        }
    }
}
