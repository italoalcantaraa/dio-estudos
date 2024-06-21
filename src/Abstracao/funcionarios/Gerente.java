package Abstracao.funcionarios;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario, int diasTrabalhados) {
        super(nome, salario, diasTrabalhados);
    }

    @Override
    public void calculaBonus() {
        if (aprovaBonus()) {
            double novoSalario = getSalario() + getSalario() * 0.1;
            System.out.printf("Parabéns! Você ganhou um bônus de %s por fazer sua obrigação.", (getSalario() * 0.1));
            setSalario(novoSalario);
        } else {
            System.out.println("Bônus não disponível )=");
        }
    }

    public void mostrarInformacoes() {

        System.out.println(toString());
    }

    @Override
    public String toString() {
        String informacoes = String.format("\nCargo: Gerente \nNome: %s \nSalário: %s \nDias Trabalhados: %s", getNome(),
                getSalario(), getDiasTrabalhados());
        return informacoes;
    }
}
