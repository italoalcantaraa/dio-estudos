package Polimorfismo.loja.servico;

import Polimorfismo.loja.dominio.Produtos;

/**
 * CalculaImposto
 */
public class CalculaImposto {
    public static void calculaImposto(Produtos produtos) {
        double taxa = produtos.calcularTaxa();
        System.out.println("Produto: " + produtos.getNome());
        System.out.println("Preco: " + produtos.getPreco());
        System.out.println("Taxa: " + taxa);
        System.out.println("Total: " + (produtos.getPreco() + taxa));
    }
}