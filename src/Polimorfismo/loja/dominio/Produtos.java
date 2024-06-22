package Polimorfismo.loja.dominio;

public abstract class Produtos implements Taxavel{
    protected String nome;
    protected double valor;

    public Produtos(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        
    }

    public double getPreco() {
        return valor;
    }
    
    public String getNome() {
        return nome;       
    }
}

