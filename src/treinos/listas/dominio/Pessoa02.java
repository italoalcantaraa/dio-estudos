package treinos.listas.dominio;

import java.util.Objects;

public class Pessoa02 {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa02(String nome, int idade, char sexo) {
        Objects.requireNonNull(nome);
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Comparar por idade
    // @Override
    // public int compareTo(Pessoa02 idadePessoa) {
    // return idade - idadePessoa.getIdade();
    // }

    // Compara por nome

    @Override
    public String toString() {
        String information = String.format("{Nome: %s, Idade: %s, Sexo %s}\n", nome, idade, sexo);
        return information;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

}
