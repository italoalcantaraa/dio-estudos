package optional.exercicios.Exer5;

import java.util.Optional;

public class Index {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(11);

        optional.filter(n -> n > 10).
                ifPresentOrElse(n -> System.out.println(n + " é maior que 10")
                , () -> System.out.println("Não atende a condição"));
    }
}
