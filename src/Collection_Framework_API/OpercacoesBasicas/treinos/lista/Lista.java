package Collection_Framework_API.OpercacoesBasicas.treinos.lista;

import java.util.ArrayList;
import java.util.Scanner;

import Collection_Framework_API.OpercacoesBasicas.exer8.List;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner ler = new Scanner(System.in);

        for(int i = 0; i < 4; i++) {
            System.out.println("Informe o "+ (i + 1) + "º valor: ");
            list.add(ler.nextInt());
        }

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
