package Herança.Produtos;

public class ProdutoEletronico extends Produto{
    private String voltagem;

    public ProdutoEletronico(String nome, double preco, String codigo, String voltagem){
        super(nome, preco, codigo);
        this.voltagem = voltagem;
    }

    public String getVoltagem() {
        return voltagem;
    }
}
