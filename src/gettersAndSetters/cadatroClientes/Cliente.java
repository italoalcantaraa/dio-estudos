package gettersAndSetters.cadatroClientes;

public class Cliente {
    private String nome;
    private long cpf;
    private String endereco;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setClienteEndereco(String newEndereco) {
        this.endereco = newEndereco;
    }

    public String getClienteEndereco() {
        return endereco;
    }

    public String getClienteNome() {
        return nome;
    }

    public long getClienteCpf() {
        return cpf;
    }

}
