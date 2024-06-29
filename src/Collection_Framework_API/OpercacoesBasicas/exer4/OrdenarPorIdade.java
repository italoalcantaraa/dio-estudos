package Collection_Framework_API.OpercacoesBasicas.exer4;

import java.util.Comparator;

public class OrdenarPorIdade implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getIdade() - p2.getIdade();
    }
}
