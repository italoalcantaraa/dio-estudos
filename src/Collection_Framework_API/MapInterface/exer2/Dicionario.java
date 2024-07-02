package Collection_Framework_API.MapInterface.exer2;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> palavras;

    public Dicionario() {
        palavras = new HashMap<>();
    }

    public void adiocionarPalavra(String palavra, String definicao) {
        palavras.put(palavra, definicao);
    }
    
    public void removerPalavra(String palavra) {
        if(!palavras.isEmpty()) {
            palavras.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(palavras);
    }

    public String pesquisarPorPalavra(String p) {
        String palavra = null;
        if(!palavras.isEmpty()) {
            palavra = palavras.get(p);            
        }
        return palavra;
    }
}
