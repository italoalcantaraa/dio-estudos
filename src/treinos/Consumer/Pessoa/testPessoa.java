package treinos.Consumer.Pessoa;

public class testPessoa {
    public static void main(String[] args) {
        ListPessoa pessoaList = new ListPessoa();
        pessoaList.addPessoas("italo", 18, 12323123L);
        pessoaList.addPessoas("maria", 12, 12213L);
        pessoaList.addPessoas("José", 18, 3232123L);

        pessoaList.searchByPessoas("italo");
        pessoaList.displayPessoas();
    }
}
