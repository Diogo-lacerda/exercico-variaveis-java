package br.com.exercicios.lista.ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenandoListaTemperaturaMedia {
    public static void main(String[] args) {
        List<Temperatura> temeraturaMedia = new ArrayList<>();

        temeraturaMedia.add(new Temperatura(35, "Janeiro"));
        temeraturaMedia.add(new Temperatura(39, "Fevereiro"));
        temeraturaMedia.add(new Temperatura(37, "Março"));
        temeraturaMedia.add(new Temperatura(32, "Abril"));
        temeraturaMedia.add(new Temperatura(41, "Maio"));
        temeraturaMedia.add(new Temperatura(38, "Junho"));

        double media = media(temeraturaMedia);
        List<Temperatura> temperaturasMaiorMedia = filtraTemperaturaMaiorMedia(temeraturaMedia, media);
        for (Temperatura temperatura : temperaturasMaiorMedia) {
            System.out.println("\tMês; " + temperatura.getMes() + "\tTemperatura; " + temperatura.getValorTemperatura() + " °C");
        }
        System.out.println("\tTemperaturas Maiores que a Média do Semestre.\n\tMédia Semestre; " + media + " °C");


    }

    private static double media(List<Temperatura> temperaturas) {
        double soma = 0;
        for (Temperatura temperatura : temperaturas) {
            soma += temperatura.getValorTemperatura();
        }
        return soma / temperaturas.size();

    }

    //    private static double media2(List<Temperatura> temperaturas) {
//        double media;
//        media = temperaturas.stream()
//                .mapToDouble(Temperatura::getTemperatura)
//                .sum() / temperaturas.size();
//        return media;
//    }
    private static List<Temperatura> filtraTemperaturaMaiorMedia(List<Temperatura> temperaturas, double media) {
        List<Temperatura> temperaturasAcimaMedia = new ArrayList<>();

        for (Temperatura temperatura : temperaturas) {
            if (temperatura.getValorTemperatura() > media) {
                temperaturasAcimaMedia.add(temperatura);
            }
        }
        return temperaturasAcimaMedia;
    }

}

