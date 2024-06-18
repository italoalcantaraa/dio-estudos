package Encapsulamento;

public class Programa {
    public static void main(String[] args) {

        Conta conta1 = new Conta("Italo", "2133312");

        conta1.setDepositar(100);
        conta1.setSacar(20);

        System.out.println(conta1.getSaldo());
        
    }
}
