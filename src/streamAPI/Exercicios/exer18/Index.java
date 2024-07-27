package streamAPI.Exercicios.exer18;

import java.util.List;

public class Index {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 1, 1, 1, 1);

        List<Integer> equalsNumbers = numList.stream()
                .filter(n -> n == numList.get(0))
                .toList();

        System.out.println(numList.size() == equalsNumbers.size());

    }
}
