package br.com.exercicios.metodos;

public class QuartoExercicio {
    public static void main(String[] args) {

        calcularArea(3.4, 5.3, 2.1);
        calcularArea(4.5, 3.5);
        calcularArea(2.5);
    }

    private static void calcularArea(double base, double altura, double baseSuperior) {
        double valorArea = ((base + baseSuperior) * altura) / 2;
        System.out.println("O valor da área e " + valorArea);
    }

    private static void calcularArea(double base, double altura) {
        double valorArea = base * altura;
        System.out.println("O valor da área e " + valorArea);

    }

    private static void calcularArea(double valorLado) {
        double valorArea = valorLado * valorLado;
        System.out.println("O valor da área e " + valorArea);

    }
}
