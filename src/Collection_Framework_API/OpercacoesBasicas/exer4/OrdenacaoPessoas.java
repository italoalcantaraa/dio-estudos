package Collection_Framework_API.OpercacoesBasicas.exer4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * OrdenacaoPessoas
 */
public class OrdenacaoPessoas {
    List<Pessoa> listPessoas;

    public OrdenacaoPessoas() {
        listPessoas = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> listOrdenaIdade = new ArrayList<>(listPessoas);
        Collections.sort(listOrdenaIdade);
        return listOrdenaIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listOrdenaAltura = new ArrayList<>(listPessoas);
        Collections.sort(listOrdenaAltura, new OrdenarPorAltura());
        return listOrdenaAltura;
        }
}