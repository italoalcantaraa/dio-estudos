package Collection_Framework_API.OpercacoesBasicas.exer2;

import Herança.Produtos.Produto;

public class testCarrinho {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Produto1", -100, 1);
        carrinhoDeCompras.adicionarItem("Produto2", 1100, 1);
        carrinhoDeCompras.adicionarItem("Produto3", 1300, 1);
        carrinhoDeCompras.adicionarItem("Produto4", 1100, 1);

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: " + carrinhoDeCompras.valorTotal());

        carrinhoDeCompras.removerItem("Produto2");

        System.out.println("\n*****\n");

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: " + carrinhoDeCompras.valorTotal());
    }
}
