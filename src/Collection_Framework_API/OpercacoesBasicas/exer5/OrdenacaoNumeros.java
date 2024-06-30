package Collection_Framework_API.OpercacoesBasicas.exer5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numeroList;

    public OrdenacaoNumeros() {
        numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(numeroList);
    }

    public void ordenarDescendente() {
        Collections.reverse(numeroList);
    }

    @Override
    public String toString() {
        String information = String.format("Números: %s", numeroList);
        return information;
    }

    public List<Integer> getNumeroList() {
        return numeroList;
    }
}
