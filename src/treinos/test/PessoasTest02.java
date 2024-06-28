package treinos.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import treinos.listas.dominio.Pessoa02;

public class PessoasTest02 {
    public static void main(String[] args) {
        List<Pessoa02> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa02("Maria", 20, 'F'));
        pessoas.add(new Pessoa02("José", 23, 'M'));
        pessoas.add(new Pessoa02("Carlo", 18, 'M'));
        pessoas.add(new Pessoa02("André", 12, 'M'));

        // Ordena por idade
        Collections.sort(pessoas);

        System.out.println(pessoas);
    }
}
