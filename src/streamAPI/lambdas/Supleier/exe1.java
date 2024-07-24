package streamAPI.lambdas.Supleier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * exe1
 */
public class exe1 {

    public static void main(String[] args) {
        Supplier<String> greetings = () -> "Olá"; 
        
        List<String> greetingsList = Stream.generate(() -> "Olá!")
        .limit(3)
        .toList();   
        
        // greetings.forEach(e -> System.out.println(e));
        greetingsList.forEach(System.out::println);
    }
}