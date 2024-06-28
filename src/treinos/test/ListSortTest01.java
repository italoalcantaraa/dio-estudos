package treinos.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import treinos.listas.dominio.Pessoa;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<Double> dinheiroList = new ArrayList<>();

        nomes.add("Gabriel");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Simone");

        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        dinheiroList.add(100.20);
        dinheiroList.add(10.04);
        dinheiroList.add(200.20);
        dinheiroList.add(50D);
        
        // sem ordenação
        for (Double dinheiro : dinheiroList) {
            System.out.println(dinheiro);
        }

        Collections.sort(dinheiroList);
        
        // Com ordenação
        for (Double dinheiro : dinheiroList) {
            System.out.println(dinheiro);
        }
}
}
