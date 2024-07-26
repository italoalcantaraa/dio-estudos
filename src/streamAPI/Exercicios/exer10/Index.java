package streamAPI.Exercicios.exer10;

import java.util.List;

public class Index {
    public static void main(String[] args) {
        // Agrupe os valores ímpares múltiplos de 3 ou de 5:

        List<Integer> numList = List.of(3, 9, 7, 20, 60, 23, 100);

        numList.stream()
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
                .forEach(System.out::println);
    }
}
