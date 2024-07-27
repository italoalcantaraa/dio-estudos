package streamAPI.Exercicios.exer17;

import java.util.List;

public class Index {
    public static void main(String[] args) {
        // Com a ajuda da Stream API, filtre os números primos da lista e exiba o
        // resultado no console.

        List<Integer> numList = List.of(1, 2, 3, 5, 8, 22, 29);

        System.out.print("Números pares: ");
        numList.stream()
                .filter(n -> checkCousin(n))
                .forEach(n -> {
                    System.out.print(n + " ");
                });
    }

    static public boolean checkCousin(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            return true;
        }

        return false;
    }
}
