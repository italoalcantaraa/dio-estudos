package streamAPI.lambdas.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class exer2 {
    public static void main(String[] args) {
        // Defina um Predicate que determina se uma string é um palíndromo

        List<String> nameList = Arrays.asList("Osso", "Carro", "Arara");
        List<String> nameListReverse = new ArrayList<>();

        for (int i = 0; i < nameList.size(); i++) {
            String reverse = "";
            for (int j = nameList.get(i).length() - 1; j >= 0; j--) {
                reverse += nameList.get(i).toLowerCase().charAt(j);
            }
            nameListReverse.add(reverse);
        }

        nameList.stream()
                .filter(p -> nameListReverse.contains(p.toLowerCase()))
                .forEach(System.out::println);
    }
}
