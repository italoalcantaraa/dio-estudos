package treinos.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class exer2 {
    public static void main(String[] args) {
        List<String> nameList = List.of("Italo", "Maria", "Stella");

        nameList.stream().forEach(n -> {
            System.out.println(n.toUpperCase());
        });
    }
}
