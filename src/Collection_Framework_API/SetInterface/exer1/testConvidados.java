package Collection_Framework_API.SetInterface.exer1;

public class testConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidadop("Italo", 123456);
        convidados.adicionarConvidadop("Carlos", 43210);
        convidados.adicionarConvidadop("Brenno", 43210);
        convidados.adicionarConvidadop("Pedro", 2321213);
        
        convidados.exibirConvidados();
        System.out.println("Quantidade de convidados: " + convidados.contarConvidados());
        convidados.removeConvidadoPorCodigoConvite(123456);
        convidados.exibirConvidados();
        System.out.println("Quantidade de convidados: " + convidados.contarConvidados());
    }
}
