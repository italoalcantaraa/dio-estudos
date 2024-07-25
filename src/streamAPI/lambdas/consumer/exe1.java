package streamAPI.lambdas.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * exe1
 */
public class exe1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Double> gradeList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a " + (i + 1) + "º nota: ");
            gradeList.add(input.nextDouble());
        }

        gradeList.forEach(n -> {
            

            System.out.println(n);
        });
    }
}