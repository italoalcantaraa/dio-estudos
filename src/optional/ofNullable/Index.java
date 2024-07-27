package optional.ofNullable;

import java.util.Optional;

public class Index {
    public static void main(String[] args) {
        String nullableValue = null;
        Optional<String> optionalValue = Optional.ofNullable(nullableValue);
        System.out.println(optionalValue.isPresent());
    }
}
