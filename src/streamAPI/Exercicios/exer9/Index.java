package streamAPI.Exercicios.exer9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Index {
    public static void main(String[] args) {
        // Verificar se todos os números da lista são distintos (não se repetem):
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosNaoRepetidos = numeros.stream()
                .distinct()
                .collect(Collectors.toList());

        boolean resultado = numeros.size() == numerosNaoRepetidos.size() ? true : false;

        System.out.println(resultado);
    }
}
