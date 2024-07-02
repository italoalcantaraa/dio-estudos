package Collection_Framework_API.MapInterface.exe3;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        String informacoes = String.format(" {Nome: %s, Preço: %s, Quantidade: %s}\n", nome, preco, quantidade);
        return informacoes;
    }
}
