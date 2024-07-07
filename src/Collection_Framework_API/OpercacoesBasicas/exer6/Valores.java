package Collection_Framework_API.OpercacoesBasicas.exer6;

import java.util.ArrayList;

import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Informe o " + (i + 1) + "º valor: ");
            values.add(input.nextInt());
        }

        for (Integer integer : values) {
            System.out.println(integer);
        }
    }
}
