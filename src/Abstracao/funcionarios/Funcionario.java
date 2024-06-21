package Abstracao.funcionarios;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private int diasTrabalhados;


    public Funcionario(String nome, double salario, int diasTrabalhados) {
        this.nome = nome;
        this.salario = salario;
        this.diasTrabalhados = diasTrabalhados;
        calculaBonus();
    }

    public Funcionario(int diasTrabalhados){
        this.diasTrabalhados = diasTrabalhados;
    }
    public boolean aprovaBonus() {
        if(diasTrabalhados < 20) {
            return false;
        }
        return true;
    }

    public abstract void calculaBonus();

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }
    
    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }
}
