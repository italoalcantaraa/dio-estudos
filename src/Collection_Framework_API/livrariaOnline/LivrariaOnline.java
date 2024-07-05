package Collection_Framework_API.livrariaOnline;

import java.util.HashMap;
import java.util.Map;

public class LivrariaOnline {
    Map<String, Livro> booksMap = new HashMap<>();

    public void addBook(String link, String title, String author, Double price) {
        booksMap.put(link, new Livro(title, author, price));
    }

    public void removeBook(String title) {
        if (!booksMap.isEmpty()) {
            for (Livro l : booksMap.values()) {
                if (l.getTitle() == title) {
                    booksMap.remove(title);
                }
            }
        }
    }

    public void displayBook() {
        for (var entryKey : booksMap.entrySet()) {
            System.out.println(" ISBN: " + entryKey + "");
        }
    }
}