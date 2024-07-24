package streamAPI.Exercicios.exer5;

import java.util.Arrays;
import java.util.List;

public class Index {
    public static void main(String[] args) {
        // Desafio 5 - Calcule a média dos números maiores que 5:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numSumList = numeros.stream().filter((n) -> n > 5).toList();

        int sum = numSumList.stream().reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("Média: " + (sum / numSumList.size()));
    }
}
