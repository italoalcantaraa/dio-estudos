package streamAPI.lambdas.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class exe2 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5);

        forEach(numList, s -> System.out.println(s));
    }
 
    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for(T i : list) {
            consumer.accept(i);
        }   
    }
}
