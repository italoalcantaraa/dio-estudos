package Polimorfismo.loja.dominio;

/**
 * Tomate
 */
public class Tomate extends Produtos{
    private static double TAXA_TOMATE = 0.06;

    public Tomate(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularTaxa() {
        System.out.println("Calculando taxa do " + getNome());
        return this.preco * TAXA_TOMATE;
    }
    
}