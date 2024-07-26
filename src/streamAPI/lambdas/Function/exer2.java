package streamAPI.lambdas.Function;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class exer2 {
    public static void main(String[] args) {

        // Dada uma lista de strings que representam números,
        // converta cada string para um número inteiro.

        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        List<String> numListToString = nums.stream().
            map(n -> n.toString()).
            collect(Collectors.toList());
            
        for (String string : numListToString) {
            System.out.println(string);
        }
    }
}
