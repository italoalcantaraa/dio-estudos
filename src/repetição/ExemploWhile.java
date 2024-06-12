package repetição;

import java.util.Random;

public class ExemploWhile {
    public static void main(String[] args) {

        double saldo = 50.0;

        while (saldo > 0) {
            double doce = ValorAleatorio();
            
            if(doce > saldo)   
                doce = saldo;
            
            
            saldo = saldo - doce;
            
            System.out.println("\nValor do produto: " + doce);
            System.out.println("Saldo: " + saldo);
        }

        System.out.println("Acabou!");
    }

    public static double ValorAleatorio(){
        Random gerador = new Random();
        
        double valor = gerador.nextDouble(5);
        return valor;
    }
}
