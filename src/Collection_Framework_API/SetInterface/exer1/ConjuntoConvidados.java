package Collection_Framework_API.SetInterface.exer1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> setConvidados;

    public ConjuntoConvidados() {
        setConvidados = new HashSet<>();
    }

    public void adicionarConvidadop(String nome, int codigoCovite) {
        setConvidados.add(new Convidado(nome, codigoCovite));
    }

    public void removeConvidadoPorCodigoConvite(int codigo) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : setConvidados) {
            if(convidado.getCodigoConvite() == codigo) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        setConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return setConvidados.size();
    }

    public void exibirConvidados() {
        System.out.println(setConvidados);
    }
}
