package treinos.Consumer.product;

import java.util.ArrayList;
import java.util.List;

public class ListProduct {
    private List<Product> products;

    public ListProduct() {
        products = new ArrayList<>();
    }

    public void addProducts(String name, Double price, String category) {
        products.add(new Product(name, price, category));
    }

    public void displayProducts() {
        if (!products.isEmpty()) {
            products.forEach(n -> {
                System.out.printf("Nome: %s, Price: %s, Categoria: %s", n.getName(), n.getPrice(), n.getCategory());
            });
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }
}
