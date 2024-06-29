package treinos.listas.dominio;

import java.util.Comparator;

public class PessoaComparatorIdade implements Comparator<Pessoa02>{
    
    // Ordena por idade
    @Override
    public int compare(Pessoa02 p1, Pessoa02 p2) {
        return p1.getIdade() - p2.getIdade();
    }
}
