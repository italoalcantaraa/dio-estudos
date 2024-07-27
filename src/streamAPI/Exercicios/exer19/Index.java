package streamAPI.Exercicios.exer19;

import java.util.List;

public class Index {
    public static void main(String[] args) {
        // Com a Stream API, encontre a soma dos números da lista que são divisíveis
        // tanto por 3 quanto por 5 e exiba o resultado no console.

        List<Integer> numList = List.of(1,3,5,15,5,90);

        int sum = numList.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .reduce(0, (n1,n2) -> n1 + n2);

        System.out.println("Soma: " + sum); 
    }
}
