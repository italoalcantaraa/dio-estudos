package Collection_Framework_API.OpercacoesBasicas.exer2;

import java.util.ArrayList;
import java.util.List;

import Collection_Framework_API.OpercacoesBasicas.exer1.Tarefa;

/**
 * CarrinhoDeCompras
 */
public class CarrinhoDeCompras {
    List<Item> carrinhoList;

    // Contrutor
    public CarrinhoDeCompras() {
        carrinhoList = new ArrayList<Item>();
    }

    // Adiciona o item ao carrinho
    public void adicionarItem(String nome, double preco, int quantidade) {
        if (validaItem(preco, quantidade)) {
            carrinhoList.add(new Item(nome, preco, quantidade));
        } else {
            System.out.println("Não foi possível adicionar o produto " + nome + ".\n");
        }
    };

    // Verifica se o preço e a quantidade são válidos
    public boolean validaItem(double preco, int quantidade) {
        if (preco < 0 || quantidade <= 0)
            return false;

        return true;
    }

    // remover os itens
    public void removerItem(String item) {
        if (carrinhoList.isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }

        List<Item> removerItens = new ArrayList<Item>();

        for (Item i : carrinhoList) {
            if (i.getNome().equalsIgnoreCase(item)) {
                removerItens.add(i);
            }
        }
        carrinhoList.removeAll(removerItens);
    }

    // Calcula o valor total
    public double valorTotal() {
        double total = 0.0;
        for (Item item : carrinhoList) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    // Exibe os itens do carrinho
    public void exibirItens() {
        if (!carrinhoList.isEmpty()) {
            for (Item i : carrinhoList) {
                System.out.println(toString(i));
                System.out.println("-----------------");
            }
        } else {
            System.out.println("Carrinho vazio!");
        }
    }

    // retorna a informação do protudo já formatada
    public String toString(Item item) {
        String informacoes = " ";

        informacoes = String.format("Nome: %s \nPreço: %s \nQuantidade: %s", item.getNome(), item.getPreco(),
                item.getQuantidade());
        return informacoes;
    }
}