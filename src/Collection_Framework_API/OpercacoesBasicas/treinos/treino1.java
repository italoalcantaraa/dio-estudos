package Collection_Framework_API.OpercacoesBasicas.treinos;

import java.util.ArrayList;
import java.util.List;

/**
 * treino1
 */
public class treino1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Nome1");
        names.add("Nome2");
        names.add("Nome3");
        names.add("Nome4");

        // Buscar elemento específico pelo índice get();
        for(int i = 0; i < names.size(); i ++){
            System.out.println(names.get(i));
        }

        // Buscar o índice de um elemento específico
        System.out.println(names.indexOf("Nome4"));

        // Verificar se a lista está vazia
        System.out.println(names.isEmpty());

        // Verifica se a lista contém um elemento específico
        System.out.println(names.contains("Nome1"));

        // Vefica o tamanho da lista
        System.out.println(names.size());

        names.clear(); // não tem retorno
        System.out.println(names.isEmpty());
    }
}