package excepcionais;

import java.util.Scanner;

public class ExecoesNaoChecadas {
    public static void main(String[] args) {
        int dividendo, divisor,calculo;
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o dividendo: ");
        dividendo  = ler.nextInt();

        System.out.println("Informe o divisor: ");
        divisor  = ler.nextInt();
        
        try {
            calculo = dividendo / divisor;    
            System.out.println("Resultado: " + calculo);
        } catch (ArithmeticException ex) {
            System.out.println("Não é possível dividir um número por zero!");
        }
}
}
