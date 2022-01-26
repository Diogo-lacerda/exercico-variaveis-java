package br.com.exercicios.lista.ordenacao;

    public class Cor implements Comparable<Cor>{
        private String nomeCor;

        public Cor(String cor) {
            this.nomeCor = cor;
        }

        public String getNomeCor() {
            return nomeCor;
        }

        @Override
        public int compareTo(Cor cor) {
            return this.getNomeCor().compareToIgnoreCase(cor.getNomeCor());
        }

    }

