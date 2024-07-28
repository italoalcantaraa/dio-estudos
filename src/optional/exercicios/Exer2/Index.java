package optional.exercicios.Exer2;

import java.util.Optional;

public class Index {
    public static void main(String[] args) {
        Optional<Usuario> valueOptional = Optional.of(new Usuario("Italo", 12));

        // valueOptional.ifPresentOrElse(usuario -> System.out.println(usuario),
        // () -> System.out.println(" não encontrado!"));

        // valueOptional.filter(usuario -> usuario.getIdade() >= 18)
        // .ifPresent(usuario -> System.out.println(usuario));

        valueOptional.map(user -> user.getIdade())
                .filter(user -> user >= 18)
                .ifPresentOrElse(user -> System.out.println("é maior de idade"),
                        () -> System.out.println("Não é maior de idade!"));
    }
}
