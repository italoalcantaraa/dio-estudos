package Polimorfismo.loja.test;

import Polimorfismo.loja.dominio.Computador;
import Polimorfismo.loja.dominio.Produtos;
import Polimorfismo.loja.dominio.Tomate;
import Polimorfismo.loja.servico.CalculaImposto;

/**
 * Loja
 */
public class Loja {
    public static void main(String[] args) {
        Produtos pc = new Computador("Samsung galaxy book 2", 3000);
        Produtos tomate = new Tomate("Siciliano", 10);

        CalculaImposto.calculaImposto(pc);
        System.out.println("-------------");
        CalculaImposto.calculaImposto(tomate);
        
    }
}