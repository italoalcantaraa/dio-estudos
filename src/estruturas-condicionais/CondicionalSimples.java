public class CondicionalSimples {
    public static void main(String[] args) {
        int saldo = 1000;
        int saque = 900;

        // Verifica se o saque é menor que o saque
        if (saque < saldo) { 
            saldo = saldo - saque;
        }

        System.out.println("Saldo Total: " + saldo);
    }
}