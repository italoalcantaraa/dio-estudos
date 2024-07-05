package Collection_Framework_API.livrariaOnline;

public class Livro {
    private String title;
    private String author;
    private Double price;

    public Livro(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " Livro: title = " + title + ", author = " + author + ", price = " + price + "";
    }

    public String getTitle() {
        return title;
    }
}
