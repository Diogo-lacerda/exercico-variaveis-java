package br.com.exercicios.exception;

public class ExercicioException {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10, 16};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % denominador[i] == 1)
                    throw new DivisaoNaoExataException("Divisão não exata.", numerador[i], denominador[i]);
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);


            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                System.out.println("Divisão não exata");
            } catch ( ArithmeticException e) {
                e.printStackTrace();
                System.out.println("Não e possível efetuar a divisão com o denominador 0");
            }
        }
    }
}
