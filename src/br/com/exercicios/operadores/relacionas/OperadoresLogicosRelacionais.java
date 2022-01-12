package br.com.exercicios.operadores.relacionas;

public class OperadoresLogicosRelacionais {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;


        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3) + "\n");

        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4) + "\n");

        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1) + "\n");

        System.out.println(!b1);
        System.out.println(!b2 + "\n");

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("(i1 + i2) < (f2 - f1)" + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1)" + ((i1 > i2) || (f2 < f1)) + "\n");

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println(((salarioMensal < mediaSalario) && (quantidadeDeDependentes >=mediaDependentes)) + "\n");

        boolean salrioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDeDependentes >= mediaDependentes;


        System.out.println(((salrioBaixo) && (muitosDependentes)) + "\n");

        boolean receberAuxilio = (salrioBaixo) && (muitosDependentes);
        System.out.println("receber auxilio " + receberAuxilio);

    }
}
