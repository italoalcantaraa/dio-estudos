package optional.exercicios.Exer4;

import java.util.Optional;

public class Index {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("italo");

        optional.map(value -> value.toUpperCase())
        .ifPresentOrElse(value -> System.out.println(value)
        , () -> System.out.println("Vazio!"));;
    }
}
