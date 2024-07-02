package Collection_Framework_API.MapInterface.exe3;

public class TestEstoqueProdutos {
    public static void main(String[] args) {
        EstoqueProdutos produtos = new EstoqueProdutos();
        produtos.adicionarProduto(2312321L, "Maçã", 2, 2);
        produtos.adicionarProduto(232313L, "Banana", 20, 12.50);
        produtos.adicionarProduto(45354435L, "Laranja", 12, 0.90);
        produtos.adicionarProduto(564344L, "Melão", 1, 0.2);
        produtos.adicionarProduto(5643242L, "Morango", 1, 40);

        produtos.exibirProdutos();

        System.out.println("VALOR TOTAL ESTOQUE: " + produtos.calcularValorEstoque());
        System.out.println("----------------");
        System.out.println("PRODUTO MAIS CARO:  " + produtos.obterProdutoMaisCaro());
        System.out.println("PRODUTO MAIS BARATO: " + produtos.obterProdutoMaisBarato());
        System.out.println("PRODUTO COM MAIOR VALOR TOTAL: " + produtos.obteProdutoMaiorQuantidadeValorEstoque());
    }
}
