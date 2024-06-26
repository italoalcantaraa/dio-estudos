package Collection_Framework_API.OpercacoesBasicas.treinos.pessoa;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Pesssoa> pesssoas = new ArrayList<Pesssoa>();

        pesssoas.add(new Pesssoa("Italo", 18));
        pesssoas.add(new Pesssoa("Nome 2", 40));
        pesssoas.add(new Pesssoa("Nome 3", 15));

        for (Pesssoa p : pesssoas) {
            System.out.println(p.getNome() + " " + p.getIdade());
        }
    }
}
