package Collection_Framework_API.MapInterface.exer1;

public class TestAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos contato1 = new AgendaContatos();
        contato1.adicionarContato("Italo", 11123213);
        contato1.adicionarContato("Pedro", 111223442);
        contato1.adicionarContato("Luccas", 11365456);

        contato1.exibirContatos();
        contato1.removerContato("Italo");
        contato1.exibirContatos();
        System.out.println(contato1.pesquisarPorNome("Luccas"));
        }
}
