package Herança.Animais;

public class Ave extends Animal {
    public Ave(String nome) {
        super(nome);
    }

    public void voar() {
        System.out.printf("\nO %s voou", getNome());
    }
}
