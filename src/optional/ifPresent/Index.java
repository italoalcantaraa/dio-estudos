package optional.ifPresent;

import java.util.Optional;

public class Index {
    public static void main(String[] args) {
        Optional<String> valueOptional = Optional.of("Oi");
        valueOptional.ifPresent(value -> System.out.println("Valor: " + value));
    }
}
