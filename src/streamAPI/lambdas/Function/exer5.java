package streamAPI.lambdas.Function;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class exer5 {
    public static void main(String[] args) {
        // Dada uma lista de raios de círculos, calcule a área de cada círculo

        List<Double> radiiOfCircles = List.of(3.45, 5d, 10d, 20.2);

        List<String> areaOfCircles = radiiOfCircles.stream().
            map(n -> "Raio: " + n + " -> Área: " + (Math.PI * (n * n)))
            .collect(Collectors.toList());
        
            areaOfCircles.forEach(System.out::println);

    }
}
