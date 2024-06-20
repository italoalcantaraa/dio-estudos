package Herança.Produtos;

import java.sql.Date;
import java.text.DateFormat;

public class Alimento extends Produto{
    private String dataValidade;
    
    public Alimento(String nome, double preco, String codigo, String dataValidade) {
        super(nome,preco,codigo);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
