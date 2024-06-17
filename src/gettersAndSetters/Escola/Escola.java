package gettersAndSetters.Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setAlunoNome("Italo");
        aluno1.setAlunoIdade(18);
        
        Aluno aluno2 = new Aluno();
        aluno2.setAlunoNome("Simone");
        aluno2.setAlunoIdade(40);

        System.out.println("Aluno(a): " + aluno1.getAlunoNome() + "\nIdade: " + aluno1.getAlunoIdade());
        System.out.println("-----------");
        System.out.println("Aluno(a): " + aluno2.getAlunoNome() + "\nIdade: " + aluno2.getAlunoIdade());
    }
}
