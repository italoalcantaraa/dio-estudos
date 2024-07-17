import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class CarrinhoDeCompra {
    List<Produto> productList;

    public CarrinhoDeCompra() {
        productList = new ArrayList<>();
    }

    public void addProduct(String name, Double price, Long code) {
        productList.add(new Produto(name, price, code));        
    }

    public void removeProduct(String name) {
            if(!productList.isEmpty()) {
                for(Produto p : productList) {
                    if(p.getName().equalsIgnoreCase(name)) {
                        productList.remove(p);
                        break;  
                    }
                }
            }else{
                System.err.println("Carrinho vazio!");
            }
        }

    public double sunCart() {
        double soma = 0;

        if(!productList.isEmpty()) {
            for(int i = 0; i < productList.size(); i ++) {
                soma += productList.get(i).getPrice();
            }
        }
        return soma;
    }

    public void displayCart() {
        Collections.sort(productList, new OrdenarPorPreco());
        System.out.println(productList);
    }
}
