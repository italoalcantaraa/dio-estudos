package Collection_Framework_API.OpercacoesBasicas.exer3;

/**
 * testLivros
 */
public class testLivros {

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1",2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2",2010);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 1",2000);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3",2000);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println("-------------");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2025));
        System.out.println("-------------");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 2"));
    }
}