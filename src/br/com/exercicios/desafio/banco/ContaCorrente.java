package br.com.exercicios.desafio.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(String agencia, String numeroConta, double saldo, Cliente cliente) {
        super(agencia, numeroConta, saldo, cliente);
    }

    public void transferencia(double valorTransferencia, ContaCorrente destinatario) {
        if (valorTransferencia > 0 && valorTransferencia <= getSaldo()) {
            destinatario.receberTransferencia(valorTransferencia);
            sacar(valorTransferencia);
            double valorTaxa = valorTransferencia * 0.03;
            sacar(valorTaxa);
        }
    }

}
