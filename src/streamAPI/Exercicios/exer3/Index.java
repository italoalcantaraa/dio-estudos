package streamAPI.Exercicios.exer3;

import java.util.Arrays;
import java.util.List;

public class Index {
    public static void main(String[] args) {
        // Desafio 3 - Verifique se todos os números da lista são positivos:

        List<Integer> numeros = Arrays.asList(1, 2, 3, -4, 5, 6, 7, 8, 9, 10, 5, 4, -3);
    
        System.out.print("Números positivos: ");
        numeros.stream().filter((n) -> n >= 0).forEach(System.out::println);
    } 
}
