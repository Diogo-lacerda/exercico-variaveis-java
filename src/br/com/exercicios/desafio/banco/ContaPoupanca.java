package br.com.exercicios.desafio.banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String agencia, String numeroConta, double saldo, Cliente cliente) {
        super(agencia, numeroConta, saldo, cliente);

    }

    @Override
    public void deposito(double valorDeposito) {
        valorDeposito++;
        super.deposito(valorDeposito);
    }

    @Override
    public void sacar(double valorSaque) {
        if (valorSaque < getSaldo() * 0.3) {
            super.sacar(valorSaque);
        }
    }



}


