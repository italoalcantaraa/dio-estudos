package Collection_Framework_API.OpercacoesBasicas.exer2;

import java.util.ArrayList;
import java.util.List;

import Collection_Framework_API.OpercacoesBasicas.exer1.Tarefa;

public class CarrinhoDeCompras {
    private List<Item> carrinho;
    private double total;

    private CarrinhoDeCompras() {
        carrinho = new ArrayList<>();
        total = 0;
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        if (validaAdicionarItem(preco, quantidade)) {
            Item item = new Item(nome, preco, quantidade);
            carrinho.add(item);
        }
    }

    public void removerItem(String nome) {
        List<Item> produtosParaRemover = new ArrayList<>();

        for (Item t : carrinho) {
            if (t.getNome().contentEquals(nome)) {
                produtosParaRemover.add(t);
            }
        }
        carrinho.removeAll(produtosParaRemover);
    };

    public double valorTotal() {
        for (Item i : carrinho) {
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibitItens() {
        if (!carrinho.isEmpty()) {
            System.out.println(toString());
        } else {
            System.out.println("Não há itens na lista");
        }
    }

    @Override
    public String toString() {
        String informacoes  = String.format("Produto: %s", carrinho);
        return informacoes;
    }

    public boolean validaAdicionarItem(double preco, int quantidade) {
        if (preco < 0 || quantidade < 1) {
            System.err.println("Valor inválido!");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Maça", 2, 2);
        carrinhoDeCompras.adicionarItem("Melão", 7, 1);
        carrinhoDeCompras.exibitItens();
    }
}
