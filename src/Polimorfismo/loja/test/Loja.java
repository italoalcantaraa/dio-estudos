package Polimorfismo.loja.test;

import Polimorfismo.loja.dominio.Computador;
import Polimorfismo.loja.dominio.Tomate;
import Polimorfismo.loja.servico.CalculaImposto;

public class Loja {
    public static void main(String[] args) {
        Computador computador = new Computador("Samsung Galaxy Book 2", 2500);
        CalculaImposto.CalculaImpostoComputador(computador);
        System.out.println("-----------");
        Tomate tomate = new Tomate("Siciliano",2);
        CalculaImposto.CalcularImpostoTomate(tomate);
    }
}
