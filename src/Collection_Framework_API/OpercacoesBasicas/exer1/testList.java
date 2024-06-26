package Collection_Framework_API.OpercacoesBasicas.exer1;

public class testList {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa1");
        listaTarefas.adicionarTarefa("Tarefa2");
        listaTarefas.adicionarTarefa("Tarefa3");
        listaTarefas.adicionarTarefa("Tarefa4");
        listaTarefas.adicionarTarefa("Tarefa5");
        listaTarefas.adicionarTarefa("Tarefa5");

        listaTarefas.removerTarefa("Tarefa5");
        System.out.println( listaTarefas.obterNumeroTarefas());
        listaTarefas.obterDescricaoTarefas();
        listaTarefas.limparTarefas();
    }
}
