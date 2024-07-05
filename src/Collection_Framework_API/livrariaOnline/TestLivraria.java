package Collection_Framework_API.livrariaOnline;

public class TestLivraria {
    public static void main(String[] args) {
        LivrariaOnline books = new LivrariaOnline();
        books.addBook("213321", "OCA Java SE 8: Guia de Estudos para o Exame 1Z0", "Edward Finegan", 111.10);
        books.addBook("23132", "Java: The Complete Reference", " Herbert Schildt", 317.10);

        books.displayBook();

    }
}
