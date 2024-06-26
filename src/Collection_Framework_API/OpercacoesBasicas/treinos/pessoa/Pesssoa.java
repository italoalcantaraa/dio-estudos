package Collection_Framework_API.OpercacoesBasicas.treinos.pessoa;

public class Pesssoa {
    private String nome;
    private int idade;

    public Pesssoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
