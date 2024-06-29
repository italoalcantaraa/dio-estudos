package treinos.listas.dominio;

import java.util.Comparator;

public class PessoaComparatorNome implements Comparator<Pessoa02>{
    @Override
    public int compare(Pessoa02 p1, Pessoa02 p2) {
        return p1.getNome().compareTo(p2.getNome());
    }
}
