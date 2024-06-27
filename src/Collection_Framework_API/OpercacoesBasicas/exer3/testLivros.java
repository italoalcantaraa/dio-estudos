package Collection_Framework_API.OpercacoesBasicas.exer3;

import java.util.ArrayList;
import java.util.List;

public interface testLivros {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2012);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2010);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2020);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 4", 2022);
        
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println("------------------------");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2020));
        System.out.println("------------------------");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
