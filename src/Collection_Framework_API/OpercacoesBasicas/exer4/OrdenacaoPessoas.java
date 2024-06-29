package Collection_Framework_API.OpercacoesBasicas.exer4;

import java.util.ArrayList;
import java.util.List;

/**
 * OrdenacaoPessoas
 */
public class OrdenacaoPessoas {
    List<Pessoa> listPessoas;

    public OrdenacaoPessoas() {
        listPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listPessoas.add(new Pessoa(nome, idade, altura));
    }    
}

