package treinos.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import treinos.listas.dominio.Pessoa;

public class PessoasTest01 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa(1, "Marcos", 2200D));
        pessoas.add(new Pessoa(4, "Ana", 2400D));
        pessoas.add(new Pessoa(2, "Fernando", 3200D));
        pessoas.add(new Pessoa(3, "Henrique", 1200D));

        Collections.sort(pessoas);

        System.out.println(pessoas);
    }
}
