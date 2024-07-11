import java.util.Collections;

public class TestCarrinho {
    public static void main(String[] args) {
        CarrinhoDeCompra cart = new CarrinhoDeCompra();

        cart.addProduct("Produto", 100.0, 1232123L);
        cart.addProduct("Poduto1", 200.0, 12321123L);
        cart.addProduct("Poduto2", 110.0, 123215675623L);
        cart.addProduct("Poduto3", 250.0, 12567621123L);
        cart.addProduct("Poduto4", 20.0, 765123L);
        
        cart.displayCart();
    }
}
