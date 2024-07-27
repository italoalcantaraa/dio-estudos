package streamAPI.Exercicios.exer12;

import java.util.List;

public class Index {
    public static void main(String[] args) {
        // Com a ajuda da Stream API, encontre o produto
        // de todos os números da lista e exiba o resultado no console.

        List<Integer> numList = List.of(1, 4, 6, 7, 5, 3);

        int sum = numList.stream().reduce(1, (n1, n2) -> n1 * n2);

        System.out.println(sum);
    }
}
