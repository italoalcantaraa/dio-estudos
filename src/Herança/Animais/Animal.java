package Herança.Animais;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void comer() {
        System.out.printf("\nO %s comeu", nome);
    }

    public void beber() {
        System.out.printf("\nO %s bebeu", nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
