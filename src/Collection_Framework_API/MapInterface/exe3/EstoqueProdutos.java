package Collection_Framework_API.MapInterface.exe3;

import java.util.HashMap;
import java.util.Map;

import javax.naming.ldap.SortKey;

public class EstoqueProdutos {
    Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        produtosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        produtosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtosMap);
    }

    public double calcularValorEstoque() {
        double valorTotal = 0;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = 0;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        } else {
            System.out.println("Não há produtos.");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                produtoMaisBarato = p;
                break;
                }
                for (Produto p : produtosMap.values()) {
                    if (p.getPreco() < produtoMaisBarato.getPreco()) {
                        if(p.getPreco() < produtoMaisBarato.getPreco()) {
                            produtoMaisBarato = p;
                        }
                    }
                }
            }
            return produtoMaisBarato;
        }
    
    // Retorna o produto que está em maior quantidade no estoque, considerando o valor total
    public Produto obteProdutoMaiorQuantidadeValorEstoque() {
        Produto produto = null;
        double maiorValor = 0;

        if(!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if((p.getPreco() * p.getQuantidade()) > maiorValor) {
                    maiorValor = p.getPreco() * p.getQuantidade();
                    produto = p;
                }
            }
        }
        return produto;
    }   
}
