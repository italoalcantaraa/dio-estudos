package optional.exercicios.Exer8;

import java.util.Optional;

import javax.xml.namespace.QName;

public class Index {
    public static void main(String[] args) {
        recebeValor("a").ifPresentOrElse(n -> System.out.println("Valor: " + n),
                () -> System.out.println("Não foi possível converter"));
    }

    public static Optional<Integer> recebeValor(String valor) {
        try {
            int converte = Integer.valueOf(valor);
            return Optional.of(converte);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
