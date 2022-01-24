package br.com.exercicios.desafio.banco;

public class ContaCorrente {
    private String agencia;
    private String numeroConta;
    private double saldo;

    public ContaCorrente(String agencia, String numeroConta, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
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
        this.saldo += valor;
    }

    public void transferencia(double valorTransferencia, ContaCorrente destinatario) {
        if (valorTransferencia > 0 && valorTransferencia <= saldo) {
            destinatario.receberTransferencia(valorTransferencia);
            saldo -= valorTransferencia;
            double valorTaxa = valorTransferencia * 0.03;
            saldo -= valorTaxa;
        }
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
}
