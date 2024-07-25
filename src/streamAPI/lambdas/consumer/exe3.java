package streamAPI.lambdas.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class exe3 {
    public static void main(String[] args) {
        //Calculadora simples

        Scanner input = new Scanner(System.in);

        List<Integer> numList = new ArrayList<>();
        
        for(int i = 0; i < 2; i++) {
            System.out.println("Informe o " + (i + 1) + "º número: " );
            numList.add(input.nextInt());
        }
    }

    public void Sum(List<Integer> list) {
        for(Integer i : list){
            
        }
    }
}
