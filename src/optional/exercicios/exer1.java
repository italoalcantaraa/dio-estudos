package optional.exercicios;

import java.util.Optional;

public class exer1 {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello");
        Optional<String> optionalVOptionalEmpty = Optional.empty();

        optionalValue.ifPresent((value) -> System.out.println("Valor presente: " + value));

        optionalValue = optionalValue.map(p -> p.toUpperCase());
        System.out.println(optionalValue.get());
    }
}
