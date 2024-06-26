package Collection_Framework_API.OpercacoesBasicas.exer1;

import java.util.ArrayList;
import java.util.List;

/**
 * ListaTarefas
 */
public class ListaTarefas {
    List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> removerTarefas = new ArrayList<Tarefa>();
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                removerTarefas.add(t);
            }
        }
        tarefas.removeAll(removerTarefas);
    }

    public void limparTarefas() {
        tarefas.clear();
    }

    public int obterNumeroTarefas() {
        return tarefas.size();
    }

    public void obterDescricaoTarefas() {
        if(!tarefas.isEmpty()) {
            for (Tarefa t : tarefas) {
                System.out.println(t.getDescricao());
            }
        }else{
            System.out.println("Lista vazia!");
        }
        
    }
}