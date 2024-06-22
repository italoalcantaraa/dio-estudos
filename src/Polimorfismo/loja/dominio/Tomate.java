package Polimorfismo.loja.dominio;

public class Tomate extends Produtos {
    public static final double TAXA_PRODUTO = 0.07;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public double TaxaProduto() {
        System.out.println("Calculando imposto do tomate...");
        return this.valor * TAXA_PRODUTO;
    }
}
