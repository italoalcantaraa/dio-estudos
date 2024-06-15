package excepcionais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Informe o nome: ");
            nome = ler.next();

            System.out.println("Informe a idade: ");
            idade = ler.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println(ex);
        }
    }
}
