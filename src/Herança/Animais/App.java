package Herança.Animais;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String[] animais = new String[] { "Cachorro", "Gato", "Dragão", "Pompo" };
        String[] nomeAnimais = new String[animais.length];

        for (int i = 0; i < animais.length; i++) {
            System.out.print("Informe o nome do " + animais[i] + ": ");
            nomeAnimais[i] = ler.next();
        }

        Cachorro cachorro1 = new Cachorro(nomeAnimais[0]);
        cachorro1.beber();
        cachorro1.comer();
        cachorro1.latir();

        System.out.println("\n------------");
        Gato gato1 = new Gato(nomeAnimais[1]);
        gato1.beber();
        gato1.comer();
        gato1.miar();

        System.out.println("\n------------");
        Dragao dragao = new Dragao(nomeAnimais[2]);
        dragao.beber();
        dragao.comer();
        dragao.soltarFogo();
        dragao.voar();

        System.out.println("\n------------");
        Pombo pombo = new Pombo(nomeAnimais[3]);
        pombo.beber();
        pombo.comer();
        pombo.voar();
        pombo.fazerPruh();
        pombo.enviarCarta();
        System.out.println("\nCartas enviadas: " + pombo.getCartasEnviadas());
    }
}