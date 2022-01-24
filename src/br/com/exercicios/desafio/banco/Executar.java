package br.com.exercicios.desafio.banco;

public class Executar {
    public static void main(String[] args) {
        // executarContaCorrente(); // Chamada do metodo Conta Corrente, sempassar nem um parametro().
        Cliente diogo = new Cliente("Diogo", "045.685.345-89",
                "765.987", "dyogot30@gmail.com",
                "Maculino", "(63)99272-5371",
                "Rua 4, Qd 46, Lote 14, Aureny IV, Palmas-TO", 2800);
        ContaPoupanca contaPoupancaDiogo = new ContaPoupanca("100-1", "234-1", 1000, diogo);
        contaPoupancaDiogo.deposito(100);
        contaPoupancaDiogo.sacar(300);
        //contaPoupancaDiogo.sacar(200);
        //contaPoupancaDiogo.sacar(200);

        System.out.println(contaPoupancaDiogo.toString());


        System.out.println();


    }

    private static void executarContaCorrente() {
        ContaCorrente victor = new ContaCorrente("2345-9", "2567-5", 2000.00);
        ContaCorrente diogo = new ContaCorrente("2345-4", "2566-3", 1000.00);

        victor.deposito(100);
        victor.transferencia(100, diogo);

        System.out.println("Saldo Victor: R$" + victor.getSaldo());
        System.out.println("Saldo Diogo: R$" + diogo.getSaldo());
    }


}
