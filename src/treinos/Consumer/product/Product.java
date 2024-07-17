package treinos.Consumer.product;

public class Product {
    private String name;
    private Double price;
    private String category;

    public Product(String name, Double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
    
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
