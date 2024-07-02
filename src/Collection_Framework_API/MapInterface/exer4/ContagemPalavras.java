package Collection_Framework_API.MapInterface.exer4;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        contagemPalavrasMap = new HashMap<>();
    }

    public void adiocionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if(!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        }else{
            System.out.println("Palavra não encontrada.");
        }
    }

    public void exibirPalavrasContagem() {
        System.out.println(contagemPalavrasMap.values());
    }
}
