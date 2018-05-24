

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books = new ArrayList<>();


    public Library(List<Book> books) {
        if (books.isEmpty()) {
            throw new IllegalArgumentException("Book list cannot not be empty!");
        }
        this.books.addAll(books);
    }

    public List<String> getAuthors() {
        return books.stream().map(Book::getAuthor).collect(Collectors.toList());
    }

    public List<String> getTitles() {
        return books.stream().map(Book::getTitle).collect(Collectors.toList());
    }

    public List<Integer> getPrices() {
        return books.stream().map(Book::getPrice).collect(Collectors.toList());
    }

    public int getTotalPrice() {
        return books.stream().map(Book::getPrice).reduce(0, (sum, price) -> sum + price);
    }

    public String getFormattedAuthors() {
        return books.stream().map(Book::getAuthor).reduce("", (raport, author) -> raport + "- " + author + "\n");
    }


}
