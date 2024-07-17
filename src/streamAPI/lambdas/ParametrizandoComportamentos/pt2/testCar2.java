package streamAPI.lambdas.ParametrizandoComportamentos.pt2;

import java.util.ArrayList;
import java.util.List;

import streamAPI.lambdas.ParametrizandoComportamentos.pt1.Car;

public class testCar2 {
    public static void main(String[] args) {
        
    }

    public static List<Car> filter(List<Car> carList, CarPredicate carPredicate) {
        List<Car> filterCar = null;
        if(!carList.isEmpty()) {
            filterCar = new ArrayList<>();
            for (Car car : carList) {
                if(carPredicate.test(car)) {
                    filterCar.add(car);
                }
            }
        }
        return filterCar;
    }
}
