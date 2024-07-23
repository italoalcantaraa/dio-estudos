package treinos.Consumer.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListPessoa {
    List<Pessoa> listPessoas;

    public ListPessoa() {
        listPessoas = new ArrayList<>();
    }
    
    public void addPessoas(String name, Integer age, Long cpf) {
        listPessoas.add(new Pessoa(name, age, cpf));
    }
    
    public void searchByPessoas(String name) {
        if(!listPessoas.isEmpty()) {
            listPessoas.forEach(p -> {
                if(p.getName().equalsIgnoreCase(name)) {
                    System.out.println(p);
                }
            });
        }else{
            System.out.println("Lista vazia!");
        }
    }

    public void removePessoas(String name) {
        List<Pessoa> removePessoasList = null;
        if(!listPessoas.isEmpty()) {
            listPessoas.forEach(p -> {
                p.getName().equalsIgnoreCase(name);
                removePessoasList.add(p);
            });
        }else{
            System.out.println("Pessoa não encontrada!");
        }
        listPessoas.removeAll(removePessoasList);
    }   

    public void displayPessoas() {
        System.out.println(listPessoas);
    }
}
