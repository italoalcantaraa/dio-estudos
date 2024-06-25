package Collection_Framework_API.OpercacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;
     
    public ListaTarefas() {
        tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        tarefaList.add(new Tarefa(tarefa));
    }

    public void removerTarefa(String tarefa) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(tarefa)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefa() {
        System.out.println(tarefaList);
    }
}
