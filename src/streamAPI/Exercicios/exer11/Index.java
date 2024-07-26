package streamAPI.Exercicios.exer11;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Index {
    public static void main(String[] args) {
        // Encontre a soma dos quadrados de todos os números da lista:

        List<Integer> numList = List.of(2, 3, 5, 6, 7, 10, 21);

        List<Integer> square = numList.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        int sum = square.stream()
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(sum);
    }
}
