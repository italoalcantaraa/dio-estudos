package operadores;

public interface operadores4 {
    public static void main(String[] args) {
        int value = 5;
        boolean variavel = false;

        value++;
        variavel = !variavel;

        System.out.println(--value);
        System.out.println(!variavel);
    }
}
