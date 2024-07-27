package streamAPI.lambdas.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class exe1 {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("Casa", "Carro", "Armário", "Porta");

        // Predicate<String> filterWord = word -> word.length() >= 5;

        // wordList.stream().
        // filter(filterWord).forEach(System.out::println);
        
        wordList.stream().filter(
                (word) -> word.length() >= 5).forEach(System.out::println);
                
    }
}
