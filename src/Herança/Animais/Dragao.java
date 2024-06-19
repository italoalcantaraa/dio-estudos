package Herança.Animais;

public class Dragao extends Ave {
    public Dragao(String nome) {
        super(nome);
    }

    public void soltarFogo() {
        System.out.printf("\nO %s soutou fogo", getNome());
    }
}
