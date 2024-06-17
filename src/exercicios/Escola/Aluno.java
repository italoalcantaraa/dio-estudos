package exercicios.Escola;

public class Aluno {
    private String nome;
    private int idade;

    public void setAlunoNome(String newNome) {
        this.nome = newNome;
    }

    public void setAlunoIdade(int newIdade) {
        this.idade = newIdade;
    }

    public String getAlunoNome() {
        return nome;
    }

    public int getAlunoIdade() {
        return idade;
    }
}
