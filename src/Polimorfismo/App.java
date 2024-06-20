package Polimorfismo;

import Polimorfismo.Filmes.Filme;
import Polimorfismo.Filmes.Series;

public class App {
    public static void main(String[] args) {
        Filme filme = new Filme("Rambo 2");
        filme.play("Português", "Inglês");

        System.out.println("------------");

        Series series = new Series("The Walking Dead", 10, 10);
        series.setAudio("Português");
        series.setLegenda("Inglês");
        System.out.println(series);
        System.out.println("------------");
        series.play(10, 2);
        System.out.println("------------");
        series.play(11, 2);
    }
}
