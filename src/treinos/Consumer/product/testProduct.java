package treinos.Consumer.product;

import Collection_Framework_API.OpercacoesBasicas.exer8.List;

/**
 * testProduct
 */
public class testProduct {

    public static void main(String[] args) {
        ListProduct listProduct = new ListProduct();

        listProduct.addProducts("Carro", 20000D, "Automóveis");
        listProduct.addProducts("Moto", 10000D, "Automóveis");

        listProduct.displayProducts();
    
    }
}