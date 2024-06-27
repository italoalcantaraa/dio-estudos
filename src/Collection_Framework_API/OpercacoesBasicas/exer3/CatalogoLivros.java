package Collection_Framework_API.OpercacoesBasicas.exer3;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listLivros;

    public CatalogoLivros() {
        listLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<Livro>();
        if (!listLivros.isEmpty()) {
            for (Livro livro : listLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<Livro>();
        if (!listLivros.isEmpty()) {
            for (Livro l : listLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;   
        if (!listLivros.isEmpty()) {
            for (Livro livro : listLivros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = livro;
                    return livrosPorTitulo;
                }
            }
        }
        return livrosPorTitulo;
    }
}
