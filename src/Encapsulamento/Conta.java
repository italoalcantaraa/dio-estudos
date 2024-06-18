package Encapsulamento;

public class Conta {
    public String nome;
    public String cpf;
    private double saldo;

    private Conta() {
        saldo = 0.0;
    }

    public Conta(String nome, String cpf) {
        this(); // Faz referência ao construtor que não tem argumentos
        this.nome = nome;
        this.cpf = cpf;
    }

    // public void setSaldo(double saldo) {
    //     this.saldo = saldo;
    // }

    public void setSacar(double valor) {
        if(valor <= saldo)
            saldo -= valor;
    }

    public void setDepositar(double valor) {
        if(valor > 0)
            saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getNome() {
        return saldo;
    }

    public double getCpf() {
        return saldo;
    }
}
