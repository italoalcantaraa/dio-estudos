package Herança.Produtos;

public class Livro extends Produto{
    private String autor;

    public Livro(String nome, double preco, String codigo, String autor){
        super(nome,preco,codigo);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
}
