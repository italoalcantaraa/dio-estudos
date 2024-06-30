package Collection_Framework_API.SetInterface.exer2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<PalavraUnica> palavraUnicas;

    public ConjuntoPalavrasUnicas() {
        palavraUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraUnicas.add(new PalavraUnica(palavra));
    }

    public void removerPalavra(String palavra) {
        PalavraUnica palavraRemover = null;

        for (PalavraUnica p : palavraUnicas) {
            if (p.getPalavra().equalsIgnoreCase(palavra)) {
                palavraRemover = p;
            }
        }
        palavraUnicas.remove(palavraRemover);
    }

    public boolean verificarPalavra(String palavra) {
        for (PalavraUnica p : palavraUnicas) {
            if(p.getPalavra().equalsIgnoreCase(palavra)) {
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavraUnicas);
    }
}
