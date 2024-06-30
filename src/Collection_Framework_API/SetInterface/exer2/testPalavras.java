package Collection_Framework_API.SetInterface.exer2;

public class testPalavras {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();
        palavras.adicionarPalavra("Palavra1");
        palavras.adicionarPalavra("Palavra2");
        palavras.adicionarPalavra("Palavra3");
        palavras.exibirPalavrasUnicas();
        
        palavras.removerPalavra("Palavra2");
        palavras.exibirPalavrasUnicas();

        System.out.println(palavras.verificarPalavra("Palavra4"));
    }
}
