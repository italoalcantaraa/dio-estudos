package streamAPI.lambdas.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemple {
    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1,2,3, 4);

        numbersList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // numbersList.forEach(n -> {
        //     if(n % 2 == 0) {
        //         System.out.println(n);
        //     }
        // });

        // Consumer<Integer> displayPairs = num -> {
        //     if (!numbersList.isEmpty()) {
        //         if(num % 2 == 0) {
        //             System.out.println(num);
        //         }      
        //     }
        // };
        // numbersList.stream().forEach(displayPairs);
    
        // numbersList.stream().forEach(new Consumer<Integer>() {
        //     public void accept(Integer num) {
        //         if(num % 2 == 0) {
        //             System.out.println(num);
        //         }
        //     };
        // } );
        
    }
}
