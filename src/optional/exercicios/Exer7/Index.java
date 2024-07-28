package optional.exercicios.Exer7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Index {
    public static void main(String[] args) {
        List<Optional<String>> optionals = new ArrayList<>();
        
        optionals.add(Optional.empty());
        optionals.add(Optional.of("italo"));
        optionals.add(Optional.of("ana"));

        optionals.stream().
                flatMap(Optional::stream)
                .map(value -> value.toUpperCase())
                .forEach(System.out::println);
    }
}
