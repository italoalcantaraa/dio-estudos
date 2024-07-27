package streamAPI.Exercicios.exer14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Index {
    public static void main(String[] args) {
        // Encontre o maior número primo da lista:

        List<Integer> numList = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 23, 29);

        List<Integer> primeNumber = numList.stream()
                .filter(n -> checkCousin(n))
                .collect(Collectors.toList());

        int numMax = numList.get(0);
        for (int i = 0; i < primeNumber.size(); i++) {
            if (primeNumber.get(i) > numMax) {
                numMax = primeNumber.get(i);
            }
        }
        System.out.println("O maior número primo é: " + numMax);
    }

    static public boolean checkCousin(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter == 2)
            return true;

        return false;
    }
}
