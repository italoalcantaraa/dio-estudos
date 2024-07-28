package optional.exercicios.Exer2;

public class Usuario {
    private String nome;
    private Integer idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        String texto = String.format("[Nome: %s, Idade: %s]", nome,idade );
        return texto; 
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
