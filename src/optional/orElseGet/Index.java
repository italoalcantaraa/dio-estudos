package optional.orElseGet;

import java.util.Optional;

public class Index {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElseGet(() -> "Value from Supplier");
        System.out.println(result);
    }
}
