package Collection_Framework_API.MapInterface.exer1;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    Map<String, Integer> agendaMap = new HashMap<>();
    
    public void adicionarContato(String nome, Integer telefone) {
        agendaMap.put(nome, telefone);
    }

    public void removerContato(String nome) {   
        if(!agendaMap.isEmpty()) {
            agendaMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numero = null;
        if(!agendaMap.isEmpty()) {
            numero = agendaMap.get(nome);
        }
        return numero;
    }
}
