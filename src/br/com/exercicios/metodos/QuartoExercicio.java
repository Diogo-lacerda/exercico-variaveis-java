package br.com.exercicios.metodos;

public class QuartoExercicio {
    public static void main(String[] args) {
        double valorArea;

        valorArea =  calcularArea(3.4, 5.3, 2.1);
        System.out.println("O valor da área e " + valorArea);
        valorArea = calcularArea(4.5, 3.5);
        System.out.println("O valor da área e " + valorArea);
        valorArea = calcularArea(2.5);
        System.out.println("O valor da área e " + valorArea);
    }

    private static double calcularArea(double base, double altura, double baseSuperior) {
        double valorArea = ((base + baseSuperior) * altura) / 2;
        return valorArea;
    }

    private static double calcularArea(double base, double altura) {
        double valorArea = base * altura;
        return valorArea;

    }

    private static double calcularArea(double valorLado) {
        double valorArea = valorLado * valorLado;
        return valorArea;
    }
}
