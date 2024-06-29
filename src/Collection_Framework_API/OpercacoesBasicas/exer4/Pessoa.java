package Collection_Framework_API.OpercacoesBasicas.exer4;

/**
 * Pessoa
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public String toString() {
        String information = String.format("\n{Nome: %s, Idade: %s, Altura: %s}", nome, idade, altura);
        return information.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }
}