package streamAPI.lambdas.ParametrizandoComportamentos.pt1;

import java.util.ArrayList;
import java.util.List;

public class testCar {
    public static void main(String[] args) {
        System.out.println(fiterCarByColor(carList, "Red"));
        System.out.println(filterByYearBefore(carList, 2010));
    }

    private static List<Car> carList = List.of(new Car("Blue", 2000), new Car("Red", 2015), new Car("Black", 2020),
            new Car("Green", 2024));

    public static List<Car> fiterCarByColor(List<Car> carList, String color) {
        List<Car> filterCar = null;

        if (!carList.isEmpty()) {
            filterCar = new ArrayList<>();
            for (Car car : carList) {
                if (car.getColor().equalsIgnoreCase(color)) {
                    filterCar.add(car);
                }
            }
        } else {
            System.out.println("Não encontrado!");
        }
        return filterCar;
    }

    public static List<Car> filterByYearBefore(List<Car> carList, int year) {
        List<Car> filterCars = null;
        if(!carList.isEmpty()) {
            filterCars = new ArrayList<>();
            for (Car car : carList) {
                if(car.getYear() < year) {
                    filterCars.add(car);
                }
            }
        }else {
            System.out.println("Não encontrado!");
        }

        return filterCars;
    }    

}
