package streamAPI.lambdas.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class exe1 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6);

        BinaryOperator<Integer> sumOperator = (num1, num2) -> num1 + num2;
        
        // Faz a soma de todos os elementos
        int sum = numList.stream().reduce(0, Integer::sum);
    
        System.out.println(sum);
    
    }
}
