package br.com.exercicios.desafio.banco;

public class Cliente  {
    private String nome;
    private String cpf;
    private String rg;
    private String email;
    private String genero;
    private String celular;
    private String endereco;
    private double renda;

    public Cliente(String nome, String cpf, String rg, String email, String genero, String celular, String endereco, double renda) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.genero = genero;
        this.celular = celular;
        this.endereco = endereco;
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\t\t nome='" + nome + '\'' +
                ",\n\t\t cpf='" + cpf + '\'' +
                ",\n\t\t rg='" + rg + '\'' +
                ",\n\t\t email='" + email + '\'' +
                ",\n\t\t genero='" + genero + '\'' +
                ",\n\t\t celular='" + celular + '\'' +
                ",\n\t\t endereco='" + endereco + '\'' +
                ",\n\t\t renda=" + renda + "\n" +
                '}';
    }
}
