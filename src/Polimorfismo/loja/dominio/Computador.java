package Polimorfismo.loja.dominio;

public class Computador extends Produtos {
    public static final double TAXA_PRODUTO = 0.20;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    public double TaxaProduto() {
        System.out.println("Calculando o imposto do computador...");
        return this.valor * TAXA_PRODUTO;  
    }
}
