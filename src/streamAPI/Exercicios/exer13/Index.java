package streamAPI.Exercicios.exer13;

import java.util.List;

public class Index {
    public static void main(String[] args) {
        // Utilize a Stream API para filtrar os números que estão dentro
        // de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no
        // console.

        List<Integer> numList = List.of(3, 5, 6, 9, 11);

        numList.stream()
                .filter(n -> n >= 5 && n <= 10).forEach(System.out::println);
    }
}
