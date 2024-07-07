package Collection_Framework_API.OpercacoesBasicas.exer9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i ++) {
            list.add(input.nextInt());
        }

        Collections.sort(list);
        System.out.println("--------");
        //Elementos já ordenados
        for(Integer i : list){
            System.out.println(i);
        }
    }
}
