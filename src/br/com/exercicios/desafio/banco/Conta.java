package br.com.exercicios.desafio.banco;

public class Conta {
    private String agencia;
    private String numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(String agencia, String numeroConta, double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;

    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(double valorSaque) {
        if (valorSaque > 0 && valorSaque < saldo) {
            saldo -= valorSaque;
        }
    }

    public void deposito(double valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
        }
    }

    private void receberTransferencia(double valor) {
        //fazer validação
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta{\n" +
                "\t agencia='" + agencia + '\'' +
                ",\n\t numeroConta='" + numeroConta + '\'' +
                ",\n\t saldo=" + saldo +
                ",\n\t cliente=" + cliente +
                '}';
    }
}