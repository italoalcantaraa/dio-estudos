    package Collection_Framework_API.OpercacoesBasicas.exer4;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
            return Integer.compare(idade, p.getIdade());
        }

        @Override
        public String toString() {
            String informacao = String.format("Nome: %s \nIdade: %s \nAltura: %s", nome, idade, altura);
            return informacao;
        }

        public double getAltura() {
            return altura;
        }

        public int getIdade() {
            return idade;
        }

        public String getNome() {
            return nome;
        }
    }

    /**
     * InnerPessoa
     */
     class OrdenarPorAltura implements Comparator<Pessoa> {

        @Override
        public int compare(Pessoa p1, Pessoa p2) {            
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }
