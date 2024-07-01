package Collection_Framework_API.SetInterface.exer3;

public class testContatos {
    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();
        contatos.adiocionarContatos("Italo", 119999999); 
        contatos.adiocionarContatos("José", 119999233); 
        contatos.adiocionarContatos("Pedro", 1123441232); 
        contatos.adiocionarContatos("André", 112342343); 
        contatos.adiocionarContatos("Marocos", 112332344);
        contatos.adiocionarContatos("Ana", 2133231);
        
        
        contatos.exibirContatos();
        System.out.println(contatos.pesquisarPorNome("A"));
        contatos.atualizarNumeroContato("Italo", 118888888);

        contatos.exibirContatos();
    }
}
