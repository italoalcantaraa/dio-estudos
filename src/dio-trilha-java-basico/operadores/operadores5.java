package operadores;

import java.util.Scanner;

public class operadores5 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int[] notas = new int[2];
            double media;
            int somaNotas = 0;

            for(int i = 0; i < 2; i ++){
                System.out.println("Informe a nota: " + (i + 1) + ": ");
                notas[i] = input.nextInt();
            }

            for (int num : notas) {
                somaNotas += num; 
            }

            media = somaNotas / notas.length;

            String aprovacao = media > 5 ? "Aprovado(a)!" : "Reprovado(a)!";
            System.out.println(aprovacao);
            System.out.println(media);
        }
}
