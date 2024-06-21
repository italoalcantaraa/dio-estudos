package Abstracao.funcionarios;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario, int diasTrabalhados) {
        super(nome, salario, diasTrabalhados);
    }

    @Override
    public void calculaBonus() {
        if (aprovaBonus()) {
            double novoSalario = getSalario() + getSalario() * 0.2;
            System.out.printf("Parabéns! Você ganhou um bônus no total de %s por fazer sua obrigação.",
                    (getSalario() * 0.2));
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
        String informacoes = String.format("\nCargo: Desenvolvedor \nNome: %s \nSalário: %s \nDias trabalhados: %s",
                getNome(), getSalario(), getDiasTrabalhados());
        return informacoes;
    }
}
