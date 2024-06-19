package Herança.Animais;

public class Pombo extends Ave {
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        cartasEnviadas = 0;
    }

    public void fazerPruh() {
        System.out.printf("\nO %s fez pruh", getNome());
    }

    public void enviarCarta() {
        System.out.printf("\nO %s enviou uma carta", getNome());
        cartasEnviadas++;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
}
