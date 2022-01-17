package br.com.exercicios.orientacaoobjeto;
/*
Orientação ao objeto.
Como chama métodos.
 */

public class Exercicio {
    public static void main(String[] args) {

        Carro carro1 = new Carro ();

        carro1.setCor("Azul");
        carro1.setModelo("Ford Focus");
        carro1.setCapacidadeTanque(58);

        System.out.println("Modelo do Veiculo: " + carro1.getModelo());
        System.out.println("Cor do Veiculo: " + carro1.getCor());
        System.out.println("Capacidade do Tanque: " + carro1.getCapacidadeTanque() + " Litros");
        System.out.println("Valor Total para encher o tanque: R$" + carro1.totalValorTanque(6.78) + "\n");


        Carro carro2 = new Carro("Cinza", "Ford Fiesta",56 );
        System.out.println("Modelo do Veiculo: " + carro2.getModelo());
        System.out.println("Cor do Veiculo: " + carro2.getCor());
        System.out.println("Capacidade do Tanque: " + carro2.getCapacidadeTanque() + " Litros");
        System.out.println("Valor Total para encher o tanque: R$" + carro2.totalValorTanque(6.89));






    }
}
