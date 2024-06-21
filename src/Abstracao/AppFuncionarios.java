package Abstracao;

import Abstracao.funcionarios.Desenvolvedor;
import Abstracao.funcionarios.Gerente;

public class AppFuncionarios {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Lucas", 2000,19);
        gerente.mostrarInformacoes();   

        System.out.println("----------");

        Desenvolvedor desenvolvedor = new Desenvolvedor("Italo", 10000, 30);
        desenvolvedor.mostrarInformacoes();
    }
}
