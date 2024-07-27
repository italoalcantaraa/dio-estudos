package optional.of;

import java.util.Optional;

public class Index {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Oi");
        System.out.println(optionalValue.get());
    }
}
