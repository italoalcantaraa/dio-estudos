package streamAPI.Exercicios.exer6;

import java.util.Arrays;
import java.util.List;

public class Index {
    public static void main(String[] args) {
        // Desafio 6 - Verificar se a lista contém algum número maior que 10:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 11, 9, 10, 5, 4, 3);

        numeros.stream().filter((n) -> n > 10).forEach(System.out::println);

    }
}
