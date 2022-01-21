package br.com.exercicios.exercicios.treinamento;

import javax.sound.midi.Soundbank;

public class ContaBancaria {
    private String nome;
    private String agencia;
    private String conta;
    private double saldoDebito;
    private double saldoCredito;
    private String dataFatura;

    public ContaBancaria(String nome, String agencia, String conta, double saldoDebito, double saldoCredito, String dataFatura) {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.saldoDebito = saldoDebito;
        this.saldoCredito = saldoCredito;
        this.dataFatura = dataFatura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldoDebito() {
        return saldoDebito;
    }

    public double getSaldoCredito() {
        return saldoCredito;
    }

    public void setSaldoCredito(double saldoCredito) {
        if (saldoCredito >= 0)
            this.saldoCredito = saldoCredito;
    }

    public String getDataFatura() {
        return dataFatura;
    }

    public void setDataFatura(String dataFatura) {
        this.dataFatura = dataFatura;
    }

    public void deposito(double valorDeposito) {
        if (valorDeposito > 0) {
            saldoDebito += valorDeposito;
        }
        else{
            System.out.println("Valor do Deposito Invalido.");
        }

    }

    public void saque(double valorSaque) {
        if (valorSaque > 0 && valorSaque < saldoDebito) {
            saldoDebito -= valorSaque;
        }
        else{
            System.out.println("Valor do Saque Invalido.");
        }
    }

}


