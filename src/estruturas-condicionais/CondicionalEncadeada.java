public class CondicionalEncadeada {
    public static void main(String[] args) {
        int mediaAluno = 10;

        if(mediaAluno >= 7)
            System.out.println("Aluno aprovado!");
        else if(mediaAluno >= 5 && mediaAluno < 7)
            System.out.println("Recuperação!");
        else
            System.out.println("Reprovado!");
    }
}
