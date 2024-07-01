package Collection_Framework_API.SetInterface.exer3;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> setContatos;

    public AgendaContatos() {
        setContatos = new HashSet<>();
    }

    public void adiocionarContatos(String nome, int numeroTelefone) {
        setContatos.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos() {
        System.out.println(setContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosNome = new HashSet<>();

        for (Contato c : setContatos) {
            if(c.getNome().startsWith(nome)) {
                contatosNome.add(c);
            }
        }
        return contatosNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato novoContato = null;

        for(Contato c : setContatos) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                novoContato = c;
            }
        }
         novoContato.setNumeroTelefone(novoNumero);
         return novoContato;
    }

}
