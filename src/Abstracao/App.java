package Abstracao;

public class App {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        ferrari.ligar();
        ferrari.acelerar();
        System.out.println("\n---------------\n");
        Fusca fusca = new Fusca();
        fusca.ligar();
        fusca.acelerar();
    }    
}
