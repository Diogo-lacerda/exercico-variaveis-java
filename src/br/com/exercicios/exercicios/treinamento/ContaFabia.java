package br.com.exercicios.exercicios.treinamento;

public class ContaFabia {
    public static void main(String[] args) {

        ContaBancaria contaFabia = new ContaBancaria("Fabia Isabela", "25102-0", "32458-9", 6000.00, 2873.97, "15/02/2022");
        contaFabia.deposito(2000.00);
        contaFabia.saque(9000.00);

        System.out.println("Banco do Brasil\nNome: " + contaFabia.getNome() + "\nAgência: " + contaFabia.getAgencia() + "\nConta: " + contaFabia.getConta() + "\nSaldo Debito: " + contaFabia.getSaldoDebito() + "\nSaldo Credito: " + contaFabia.getSaldoCredito() + "\nData da Fatura: " + contaFabia.getDataFatura());

    }

}
