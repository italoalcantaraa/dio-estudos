package Polimorfismo.loja.dominio;

/**
 * Produtos
 */
public abstract class Produtos implements Taxavel{
    private String nome;
    protected double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
};