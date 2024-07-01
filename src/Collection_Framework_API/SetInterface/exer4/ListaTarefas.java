package Collection_Framework_API.SetInterface.exer4;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> setTarefas;

    public ListaTarefas() {
        setTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String tarefa) {
        setTarefas.add(new Tarefa(tarefa));
    }

    public void removerTarefas(String tafera) {
        Tarefa tarefaRemover = null;

        for (Tarefa t : setTarefas) {
            if (t.getDescricao().equalsIgnoreCase(tafera)) {
                tarefaRemover = t;
            }
        }

        setTarefas.remove(tarefaRemover);
    }

    public void exibirTarefas() {
        System.out.println(setTarefas);
    }

    public int contarTarefas() {
        return setTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa tarefa : setTarefas) {
            if(tarefa.getTarefaConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa tarefa : setTarefas) {
            if(!tarefa.getTarefaConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : setTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setTarefaConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : setTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setTarefaConcluida(false);
            }
        }
    }   

    public void limparTarefas() {
        setTarefas.clear();
    }

}
