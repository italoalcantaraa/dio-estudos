package Polimorfismo.loja.servico;

import Polimorfismo.loja.dominio.Computador;
import Polimorfismo.loja.dominio.Tomate;

public class CalculaImposto {
    public static void CalculaImpostoComputador(Computador computador) {
        double imposto = computador.TaxaProduto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Preço: " + computador.getPreco());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    public static void CalcularImpostoTomate(Tomate tomate) {
        double imposto = tomate.TaxaProduto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Preço: " + tomate.getPreco());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
