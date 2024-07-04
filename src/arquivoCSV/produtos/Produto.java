package arquivoCSV.produtos;

/**
 * exer4
 */
public class Produto {
    private String name;
    private Double price;
    private Integer quantity;

    public Produto(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Produto [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}