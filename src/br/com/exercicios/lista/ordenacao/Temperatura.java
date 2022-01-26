package br.com.exercicios.lista.ordenacao;

public class Temperatura implements Comparable<Temperatura> {
    private double valorTemperatura;
    private String mes;

    public Temperatura(double temperatura, String mes) {
        this.valorTemperatura = temperatura;
        this.mes = mes;
    }

    public double getValorTemperatura() {
        return valorTemperatura;
    }

    public String getMes() {
        return mes;
    }

    @Override
    public int compareTo(Temperatura o) {
        return 0;
    }
}
