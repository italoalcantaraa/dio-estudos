package optional.empty;

import java.util.Optional;

public class Index {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.empty();
        System.out.println(optionalValue.isPresent());
    }
}
