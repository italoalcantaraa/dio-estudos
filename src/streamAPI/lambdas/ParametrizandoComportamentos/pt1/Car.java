package streamAPI.lambdas.ParametrizandoComportamentos.pt1;

public class Car {
    private String name = "Audi";
    private String color;
    private int year;

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        String information = String.format("[Car: %s, Color: %s, Year: %s]", name, color, year);
        return information;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
