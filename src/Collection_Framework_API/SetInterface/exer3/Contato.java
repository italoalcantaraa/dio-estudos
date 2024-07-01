package Collection_Framework_API.SetInterface.exer3;

public class Contato {
    private String nome;
    private int numeroTelefone;

    public Contato(String nome,int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        String information = String.format("\n{Nome: %s, Telefone: %s}", nome, numeroTelefone);
        return information;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numeroTelefone;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (numeroTelefone != other.numeroTelefone)
            return false;
        return true;
    }
}
