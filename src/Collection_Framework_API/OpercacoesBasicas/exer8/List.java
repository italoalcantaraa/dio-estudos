package Collection_Framework_API.OpercacoesBasicas.exer8;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listRemove = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe a " + (i + 1) + "º palavra: ");
            list.add(input.nextLine());

        }
        input.close();

        for (String l : list) {
            if (l.length() < 3) {
                listRemove.add(l);
            }
        }
        list.removeAll(listRemove);

        for (String l : list) {
            System.out.println(l);
        }
    }
}
