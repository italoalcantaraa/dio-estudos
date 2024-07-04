package Collection_Framework_API.MapInterface.agendaEvento;

public class Evento {
    private String nomeEvento;
    private String nomeAtracao;

    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    @Override
    public String toString() {
        return " Evento [nomeEvento = " + nomeEvento + ", nomeAtracao = " + nomeAtracao + "]";
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }
    
    public String getNomeEvento() {
        return nomeEvento;
    }
}
