package br.com.exercicios.desafio.banco;

public class Executar {
    public static void main(String[] args) {
        executarContaCorrente(); // Chamada do metodo Conta Corrente, sempassar nem um parametro().
        executarContaPouoança();

    }

    private static void executarContaPouoança() {
        Cliente diogo = getDiogo();
        ContaPoupanca contaPoupancaDiogo = new ContaPoupanca("100-1", "234-1", 1000, diogo);
        contaPoupancaDiogo.deposito(100);
        contaPoupancaDiogo.sacar(300);
        //contaPoupancaDiogo.sacar(200);
        //contaPoupancaDiogo.sacar(200);

        System.out.println(contaPoupancaDiogo.toString());
    }

    private static Cliente getDiogo() {
        return new Cliente("Diogo", "045.685.345-89",
                "765.987", "dyogot30@gmail.com",
                "Maculino", "(63)99272-5371",
                "Rua 4, Qd 46, Lote 14, Aureny IV, Palmas-TO", 2800);
    } private static Cliente getVictor() {
        return new Cliente("Victor", "035.656.335-81",
                "726.167", "victor.dev@gmail.com",
                "Maculino", "(63)99272-5371",
                "Rua 4, Qd 46, Lote 14, Aureny IV, Palmas-TO", 2800);
    }

    private static void executarContaCorrente() {
        Cliente diogo = getDiogo();
        Cliente victor = getVictor();
        ContaCorrente contaCorrenteVictor = new ContaCorrente("2345-9", "2567-5", 2000.00,victor);
        ContaCorrente contaCorrenteDiogo = new ContaCorrente("2345-4", "2566-3", 1000.00,diogo);

        contaCorrenteVictor.deposito(100);
        contaCorrenteVictor.transferencia(100,contaCorrenteDiogo);

        System.out.println("Saldo Victor: R$" + contaCorrenteVictor.getSaldo());
        System.out.println("Saldo Diogo: R$" + contaCorrenteDiogo.getSaldo());
    }


}
