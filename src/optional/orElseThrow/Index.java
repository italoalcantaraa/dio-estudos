package optional.orElseThrow;

import java.util.Optional;

public class Index {
    public static void main(String[] args) {
        Optional<String> valueOptional = Optional.ofNullable(null);
        String result = valueOptional.orElseGet(() -> "Value not present");
        System.out.println(result);
    }
}
