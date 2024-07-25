package streamAPI.lambdas.Supleier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exe3 {
    public static void main(String[] args) {
        Supplier<String> saudacoes = () -> "Oi";

        List<String> saudacoesList = Stream.generate(saudacoes)
            .limit(5)
            .collect(Collectors.toList());
    
        saudacoesList.forEach(System.out::println);
   
        saudacoesList.add("Olá");
    }
}
