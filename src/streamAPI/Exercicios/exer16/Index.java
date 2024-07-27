package streamAPI.Exercicios.exer16;

import java.util.List;

public class Index {
    public static void main(String[] args) {
        // Utilize a Stream API para agrupar os números em duas listas separadas, uma
        // contendo os números
        // pares e/outra contendo os números ímpares da lista original, e exiba os
        // resultados no console.

        List<Integer> numList = List.of(1, 2, 4, 5, 6, 7, 8, 9);

        List<Integer> pairNumbers = numList.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> oddNumbers = numList.stream()
                .filter(n -> !pairNumbers.contains(n))
                .toList();

        pairNumbers.forEach(n -> {
            System.out.println("Par = " + n);
        });

        oddNumbers.forEach(n -> {
            System.out.println("Ímpar = " + n);
        });
    }
}
