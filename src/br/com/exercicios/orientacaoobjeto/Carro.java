package br.com.exercicios.orientacaoobjeto;

public class Carro extends VeiculosHeranca {

    String cor;                     // Atributos criados para a classe Carro
    String modelo;                  // Lembrando sempre que tipo de dado que esta sendo usado
    int capacidadeTanque;
    //Boas práticas o construtor deve sempre esta abaixo dos atributos
    //nesta operações abaixo foram feitas as sobrecargas do construtor Carro

    Carro(){

    }
    Carro( String cor, String modelo, int capacidadeTanque  ){
        this.cor =cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }

    void setCor(String cor) {
        this.cor = cor;
    }
    // set conceito usado para guarda algo
    String getCor() {
        return cor;
    }
    // get conceito usado para busca algo
    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorConbustivel){
        return capacidadeTanque * valorConbustivel;
    }
}
