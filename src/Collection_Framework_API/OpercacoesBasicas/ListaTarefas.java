package Collection_Framework_API.OpercacoesBasicas;

import java.util.ArrayList;
import java.util.List;

/**
 * ListaTarefas
 */
public class ListaTarefas {
    private List<Tarefa> tarefasList;

    public ListaTarefas() {
        tarefasList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String tarefa) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : tarefasList) {
            if (t.getDescricao().equalsIgnoreCase(tarefa))
                tarefasParaRemover.add(t);
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefasList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefasList);
    }

}