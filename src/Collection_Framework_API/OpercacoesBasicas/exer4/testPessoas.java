package Collection_Framework_API.OpercacoesBasicas.exer4;

import java.util.Collections;
import java.util.List;

public class testPessoas {
    public static void main(String[] args) {
        OrdenacaoPessoas pessoa = new OrdenacaoPessoas();
        pessoa.adicionarPessoa("Maria", 20, 1.69);
        pessoa.adicionarPessoa("Pedrinho", 12, 1.62);
        pessoa.adicionarPessoa("José", 84, 1.69);
        pessoa.adicionarPessoa("Cariri", 48, 1.79);
        pessoa.adicionarPessoa("Ana", 24, 1.65);

        System.out.println(pessoa.listPessoas);
        System.out.println("-----------");
        
        // Ordena po idade
        Collections.sort(pessoa.listPessoas, new OrdenarPorIdade());
        System.out.println(pessoa.listPessoas);

        System.out.println("-----------");

        // Ordenar por altura
        Collections.sort(pessoa.listPessoas, new OrdenarPorAltura());
        System.out.println(pessoa.listPessoas);
    }
}
