package Herança.Produtos;

public class Loja {
    public static void main(String[] args) {
        Alimento alimento = new Alimento("Manga", 4.40, "23231321", "01/07/2024");
        System.out.println(alimento.getNome());
        System.out.println(alimento.getPreco());
        System.out.println(alimento.getDataValidade());

        Livro livro = new Livro("Inovação", 20.0, "21331312", "Steve Jobs");
        System.err.println(livro.getNome());
        System.err.println(livro.getPreco());
        System.err.println(livro.getAutor());

        ProdutoEletronico produtoEletronico = new ProdutoEletronico("Carregador", 60.0, "214231", "3v a 12v");
        System.out.println(produtoEletronico.getNome());
        System.out.println(produtoEletronico.getPreco());
        System.out.println(produtoEletronico.getVoltagem());
    }
}
