import java.util.Comparator;

public class OrdenarPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2) {
        if(p1.getPrice() > p2.getPrice()) {
            return 1;
        }else if(p1.getPrice() < p2.getPrice()) {
            return -1;
        }else {
            return 0;
        }
    }
}