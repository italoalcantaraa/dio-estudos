package streamAPI.Exercicios.exer15;

import java.util.Arrays;
import java.util.List;

public class Index {
    public static void main(String[] args) {

        //Verifique se a lista contém pelo menos um número negativo
        List<Integer> numList = List.of(-1, 1,3,4,5,6);

        numList.stream().filter(n -> n >= 0).
            forEach(n -> System.out.println(n + " = Positivo"));
    }
}
