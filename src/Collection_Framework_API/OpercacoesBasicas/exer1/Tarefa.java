package Collection_Framework_API.OpercacoesBasicas.exer1;

/**
 * Tarefa
 */
public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        String novaDescricao = String.format("Descrição: %s", descricao);
        return novaDescricao;
    }
}