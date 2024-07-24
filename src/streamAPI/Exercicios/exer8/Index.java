package streamAPI.Exercicios.exer8;

import java.util.Arrays;
import java.util.List;

public class Index {
    public static void main(String[] args) {
        // Desafio 8 - Somar os números da lista:

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        var soma = numeros.stream().reduce((n1, n2) -> n1 + n2);

        System.out.println(soma);

        numeros.stream().map((n) -> n * 2).collect(null);
    }
}
