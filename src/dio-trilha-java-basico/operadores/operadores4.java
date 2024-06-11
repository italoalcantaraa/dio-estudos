package operadores;

public interface operadores4 {
    public static void main(String[] args) {
        int value = 5;
        boolean variavel = false;

        value++; // Incrementou +1
        variavel = !variavel; // Converteu para true

        System.out.println(--value); //Decrementou 1
        System.out.println(!variavel); //Converteu para false novamente
    }
}
