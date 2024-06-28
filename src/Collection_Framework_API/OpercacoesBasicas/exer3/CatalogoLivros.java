package Collection_Framework_API.OpercacoesBasicas.exer3;

import java.util.ArrayList;
import java.util.List;
/**
 * CatalogoLivros
 */
public class CatalogoLivros {

    private List<Livro> listLivros;

    public CatalogoLivros() {
        listLivros = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> autorLivros = new ArrayList<Livro>();
        if(!listLivros.isEmpty()) {
            for (Livro livro : listLivros) {
                if(livro.getAutor().equalsIgnoreCase(autor)) {
                    autorLivros.add(livro);
                }
            }
        }
        return autorLivros;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<Livro>();
        if(!listLivros.isEmpty()) {
            for (Livro livro : listLivros) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorAno.add(livro);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if(!listLivros.isEmpty()) {
            for (Livro livro : listLivros) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    return livroPorTitulo;
                }
            }
        }
        return livroPorTitulo;
    }

}