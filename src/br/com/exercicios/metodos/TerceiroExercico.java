package br.com.exercicios.metodos;

/*
Calcule o valor final de um empréstismo, a partir do valor solicitado.taxas e parcelas influenciam.
 */
public class TerceiroExercico {
    public static void main(String[] args) {
        imprimirValorFinalEmprestimo(3000, 36);
    }

    private static void imprimirValorFinalEmprestimo(int valorSolicitado, int numerosDeParcelas) {
        if (numerosDeParcelas == 12) {
            double juros = 0.1;
            double valorFinal = calcularValorFinal(valorSolicitado, juros);
            double valorParcelas = calcularValorParcela (valorFinal, numerosDeParcelas);
            System.out.println("com 12 parcelas o valor final fica: " + valorFinal);
            System.out.println("12 parcela de " + valorParcelas);
        } else if (numerosDeParcelas == 24) {
            double juros = 0.2;
            double valorFinal = calcularValorFinal(valorSolicitado, juros);
            double valorParcelas = calcularValorParcela (valorFinal, numerosDeParcelas);
            System.out.println("com 24 parcelas o valor final fica: " + valorFinal);
            System.out.println("24 parcela de " + valorParcelas);
        } else if (numerosDeParcelas == 36) {
            double juros = 0.3;
            double valorFinal = calcularValorFinal(valorSolicitado, juros);
            double valorParcelas = calcularValorParcela (valorFinal, numerosDeParcelas);
            System.out.println("com 36 parcelas o valor final fica: " + valorFinal);
            System.out.println("36 parcelas de " + valorParcelas);
        } else {
            System.out.println("Quantidades de parcelas invalidas, (12, 24, 36)");
        }

    }

    private static double calcularValorParcela(double valorFinal, int numerosDeParcelas) {
        double valorParcelas = valorFinal / numerosDeParcelas;
        return valorParcelas;
    }

    private static double calcularValorFinal(int valorSolicitado, double juros) {
        double valorJuros = valorSolicitado * juros;
        double valorFinal = valorSolicitado + valorJuros;
        return valorFinal;
    }
}
