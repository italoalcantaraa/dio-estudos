package Collection_Framework_API.OpercacoesBasicas.exer4;

import java.util.Comparator;

public class OrdenarPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        if (p1.getAltura() > p2.getAltura())
            return 1;
        else if (p1.getAltura() == p2.getAltura())
            return 0;
        else
            return -1;
    }
}
