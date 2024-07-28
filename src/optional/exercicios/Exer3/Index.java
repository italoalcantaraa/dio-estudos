package optional.exercicios.Exer3;

import java.util.Optional;

import javax.swing.text.html.Option;

public class Index {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.ofNullable(null);

        optional.ifPresentOrElse((value) -> System.out.println(value),
                () -> System.out.println("Vazio!"));
    }
}
