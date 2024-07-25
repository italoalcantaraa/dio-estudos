package streamAPI.Exercicios.exer4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Index {
    public static void main(String[] args) {
        // Desafio 4 - Remova todos os valores ímpares:

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        numeros.removeIf((n) -> n % 2 != 0);

        System.out.println("Lista sem números ímpares: ");
        numeros.forEach(System.out::println);
    }
}
