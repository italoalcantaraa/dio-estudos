package repetição;

import java.util.Random;

public class Atende {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while (AtendeTelefone());
        System.out.println("Alô!!!");
    }

    public static boolean AtendeTelefone() {
        boolean atendeu = new Random().nextInt(10) == 1;
        System.out.println("Atendeu? " + atendeu);

        return !atendeu;
    }

}
