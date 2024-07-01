package Collection_Framework_API.SetInterface.exer4;

public class testTarefas {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();
        tarefas.adicionarTarefa("Tarefa 1");
        tarefas.adicionarTarefa("Tarefa 2");
        tarefas.adicionarTarefa("Tarefa 3");
        tarefas.adicionarTarefa("Tarefa 4");
        tarefas.adicionarTarefa("Tarefa 5");

        tarefas.exibirTarefas();
        System.out.println(tarefas.contarTarefas());
        tarefas.marcarTarefaConcluida("Tarefa 1");

        System.out.println(tarefas.obterTarefasPendentes());
        System.out.println(tarefas.obterTarefasConcluidas());

        tarefas.removerTarefas("Tarefa 5");
        tarefas.exibirTarefas();

    }
}
