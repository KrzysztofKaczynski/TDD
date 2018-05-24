import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books = new ArrayList<>();

    public static boolean filterOutAnteks(Book book) {
        return !book.getAuthor().equals("Antek");
    }

    public Library(List<Book> books) {
        this.books.addAll(books);
    }

    public List<String> getAuthors() {
        return books.stream().map(Book::getAuthor).collect(Collectors.toList());
    }

    public List<Book> getNotAnteks() {
        return books.stream().filter(Library::filterOutAnteks).collect(Collectors.toList());
    }

}
