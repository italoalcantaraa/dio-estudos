package Herança.Animais;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.printf("\nO %s latiu", getNome());
    }

    public void lamber() {
        System.out.printf("\nO %s lambeu", getNome());
    }
}
