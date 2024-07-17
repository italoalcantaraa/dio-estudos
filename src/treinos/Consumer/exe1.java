package treinos.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class exe1 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        
        // forEach(nums, (Integer n) -> System.out.println(n));
        forEach(nums, n -> System.out.println(n));
    }               

    // Consumer
    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
