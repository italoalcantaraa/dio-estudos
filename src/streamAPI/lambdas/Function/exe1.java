package streamAPI.lambdas.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import Abstracao.funcionarios.Gerente;

public class exe1 {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6);

       Function<Integer, Integer> bend = num -> num * 2;

       List<Integer> doubleNumbers = numList.stream()
       .map((num) -> num * 2)
       .toList();
    
        doubleNumbers.forEach(System.out::println);
        
    }
}
