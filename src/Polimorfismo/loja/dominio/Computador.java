package Polimorfismo.loja.dominio;

/**
 * Computador
 */
public class Computador extends Produtos {
    private static double TAXA_COMPUTADOR =  0.2;
    public Computador(String nome, double preco) {
        super(nome,preco);
    }

    public double calcularTaxa() {
        System.out.println("Calculando taxa do computador");
        return this.preco * TAXA_COMPUTADOR;
    }
    
}