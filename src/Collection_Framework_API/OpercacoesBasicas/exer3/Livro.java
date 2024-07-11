package Collection_Framework_API.OpercacoesBasicas.exer3;

/**
 * Livro
 */
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        String informacoes = String.format("Livro: %s \nAutor: %s \nAno de publicação: %s", titulo, autor, anoPublicacao);
        return informacoes;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
}