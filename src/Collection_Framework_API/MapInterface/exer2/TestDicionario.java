package Collection_Framework_API.MapInterface.exer2;

public class TestDicionario {
   public static void main(String[] args) {
    Dicionario palavra = new Dicionario();
    palavra.adiocionarPalavra("Palavra1", "Definição1");
    palavra.adiocionarPalavra("Palavra2", "Definição2");
    palavra.adiocionarPalavra("Palavra3", "Definição3");
    palavra.adiocionarPalavra("Palavra4", "Definição4");
    
    palavra.exibirPalavras();

    palavra.removerPalavra("Palavra1");
    palavra.exibirPalavras();
    System.out.println(palavra.pesquisarPorPalavra("Palavra4"));
}  
}
