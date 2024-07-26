package streamAPI.lambdas.Function;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class exer3 {
    public static void main(String[] args) {

        // Dada uma lista de strings, adicione um prefixo a cada string.

        List<String> stringList = Arrays.asList("Consumer", "Function", "BinaryOperator", "Predicate");

        List<String> stringPrefix = stringList.stream().map(s -> "Functional Interface - " + s)
                .collect(Collectors.toList());

        stringPrefix.forEach(System.out::println);
    }
}
