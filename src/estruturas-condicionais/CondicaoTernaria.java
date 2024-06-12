public class CondicaoTernaria {
    public static void main(String[] args) {
        int mediaAluno = 10;
        String resultadoAluno = mediaAluno >= 7 ? "Aprovado"
                : mediaAluno < 7 && mediaAluno >= 5 ? "Recuperação!" : "Reprovado";

                System.out.println("Estado: " + resultadoAluno);
    }   
}
