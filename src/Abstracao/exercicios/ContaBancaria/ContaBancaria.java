package Abstracao.exercicios.ContaBancaria;

public class ContaBancaria {
    private String cliente;
    private int numeroConta;
    private float saldo;

    public void sacar(double saque) {
        if (saque <= saldo)
            saldo -= saque;
    }

    public void depositar(double deposito) {
        if (deposito >= 0)
            saldo += deposito;
    }

    public String getNomeCliente() {
        return cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }
}
