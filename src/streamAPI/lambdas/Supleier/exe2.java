package streamAPI.lambdas.Supleier;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class exe2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Double> gradeList = Stream.generate(() -> (input.nextDouble()))
        .limit(3).
        toList(); 

        gradeList.forEach(System.out::println);
    }
}
