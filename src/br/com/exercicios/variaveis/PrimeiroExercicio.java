package br.com.exercicios.variaveis;

public class PrimeiroExercicio {

    public static void main(String[] args) {

        int i;
        //int i;    não pode ser feito vai sempre da error
        int I;
        //int 1a;
        int _1a; // pode ser feito, mas nao deve.
        int $aq; // pode ser feito, mas nao deve.


        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15;
        int asrn24678md;
        //int asrz46 78nd;      não pode ser feito vai sempre da error
        int asrn2$4678_nd = 10;     // pode ser feito, mas nao deve.
        //int asrn2$46%78_nd = 10;  não pode ser feito vai sempre da error

        asrn24678md = 100;
        //asrn2$4678_nd = 100;

        int quantidadedeproduto = 50;  //esta variavel esta OK, sendo utilizada a anotação camelo
        //int QuantidadedeProduto;  //segue a anotação camelo mas nao segue as boas praticas de começar com letra minuscula
        final int NUMERO_TENTATIVAS = 5;  //Variaveis constantes sempre devem esta todas as letras em maiculo e separar os nomes com _'anderline'
        //final  int numeroTentativas = 5;
        int QUANTIDADE_OPCOES = 25;     // pode ser feito, mas nao deve.
        //int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_nd);

        System.out.println(quantidadedeproduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }
}
