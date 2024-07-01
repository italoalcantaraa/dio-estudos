package Collection_Framework_API.SetInterface.exer4;

public class Tarefa {
    private String descricao;
    private boolean tarefaConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        tarefaConcluida = false;
    }

    @Override
    public String toString() {
        String information = String.format("\n{Descrição: %s, Concluída: %s}", descricao, tarefaConcluida);
        return information;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }
}
