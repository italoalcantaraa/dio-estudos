package treinos.listas.dominio;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private long id;
    private String nome;
    private double salario;

    public Pessoa(int id, String nome, double salario) {
        Objects.requireNonNull(id, "O id não pode ser null");
        Objects.requireNonNull(nome, "O nome não pode ser null");
        Objects.requireNonNull(salario, "O salário não pode ser null");
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public long getId() {
        return id;
    }

    @Override
    public int compareTo(Pessoa idPessoa) {
        if (id < idPessoa.getId()) {
            return -1;
        } else if (id == idPessoa.getId()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        String information = String.format("{Id: %s, Nome: %s, Salário: %s}", id, nome, salario);
        return information;
    }
}
