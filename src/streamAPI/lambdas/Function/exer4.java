package streamAPI.lambdas.Function;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exer4 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Italo", "Fernando", "Pedro", "Henrique");

        List<String> textLenght = nameList.stream()
            .map(s -> s + " | Tamanho: " + s.length())
            .collect(Collectors.toList());

        textLenght.forEach(System.out::println);
    }
}
