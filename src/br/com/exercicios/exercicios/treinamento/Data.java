package br.com.exercicios.exercicios.treinamento;

/*
Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos
seguintes métodos:
construtor define a data que determinado objeto (através de parâmetro), este método verifica se a
data está correta, caso não esteja a data é configurada como 01/01/0001
compara recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e
retorne:
ú 0 se as datas forem iguais;
ú 1 se a data corrente for maior que a do parâmetro;
ú -1 se a data do parâmetro for maior que a corrente.
getDia retorna o dia da data
getMes retorna o mês da data
getMesExtenso retorna o mês da data corrente por extenso
getAno retorna o ano da data
isBissexto retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
clone o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os
mesmos valores de atributos e retorna sua referência pelo método
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String mesExtenso;

    public Data(int dia, int mes, int ano, String mesExtenso) {

        if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (ano >= 1)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.mesExtenso = mesExtenso;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;

        }

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getMesExtenso() {
        return mesExtenso;
    }

    public void setMesExtenso(String mesExtenso) {
        this.mesExtenso = mesExtenso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String imprimiData() {
        return (dia + "/" + mes + "/" + ano);
    }

    public int compara(Data data) {
        if (this.dia == data.getDia() && this.mes == data.getMes() && this.ano == data.getAno()) {
            return 0;
        }
        else if (this.ano > data.getAno()){
            return 1;
        }
        else{
            return -1;
        }

    }

}
