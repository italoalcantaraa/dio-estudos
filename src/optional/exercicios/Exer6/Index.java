package optional.exercicios.Exer6;

import java.util.Optional;

public class Index {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);

        System.out.println(optional.orElseGet(() -> "Vazio!"));
    }
}
