package streamAPI.lambdas.Supleier;

import java.util.List;
import java.util.stream.Stream;

/**
 * exe1
 */
public class exe1 {

    public static void main(String[] args) {
        List<String> greetings = Stream.generate(() -> "Olá!")
        .limit(3)
        .toList();        
        
        // greetings.forEach(e -> System.out.println(e));
        greetings.forEach(System.out::println);
    }
}