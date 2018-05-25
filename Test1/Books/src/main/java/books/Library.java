package books;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Library {

    private List<Book> books = new ArrayList<>();
    MoneyLaunderingService moneyLaunderingService;

    public Library(List<Book> books) {
        this.books.addAll(books);
    }

    public Library(List<Book> books, MoneyLaunderingService moneyLaunderingService) {
        this.books = books;
        this.moneyLaunderingService = moneyLaunderingService;
    }

    public Set<String> getAuthors() {
        return books.stream().map(book -> book.getAuthor()).collect(Collectors.toSet());
    }

    public List<String> getTitle() {
        return books.stream().map(book -> book.getTitle()).collect(Collectors.toList());
    }

    public List<Integer> getPrice() {
        return books.stream().map(book -> book.getPrice()).collect(Collectors.toList());
    }

    public List<String> getBooksOFAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equals(author)).map(book -> book.getTitle()).collect(Collectors.toList());
    }

    public List<Book> getBooksByTitle(String title) {
        return books.stream().filter(book -> book.getTitle().equals(title)).collect(Collectors.toList());
    }

    public List<Book> getMyPrice(Integer price) {
        return books.stream().filter(book -> book.getPrice().equals(price)).collect(Collectors.toList());
    }

    public List<Book> getBooksByRangePrice(Integer min, Integer max) {
        return books.stream().filter(book -> book.getPrice() > min).filter(book -> book.getPrice() < max).collect(Collectors.toList());
    }

    public Integer getReduce() {
        return books.stream().map(book -> book.getPrice()).reduce(0, (price1, price2) -> price1 + price2);
    }

    //- zwrócenie sumy cen wszystkich książek podanego autora, wyłączając podany tytuł
    public Integer getPriceAllBooksWithoutTitle(String author, String title) {
        return books.stream().
                filter(book -> !book.getTitle().equals(title)).
                filter(book -> book.getAuthor().equals(author)).
                map(book -> book.getPrice()).reduce(0, (price1, price2) -> price1 + price2);
    }


    //zwrocenie liczby ksiazek wydanych w danycm roku
    public List<Book> getBooksByDate(int year) {
        return books.stream().filter(book -> book.getDate().getYear() == year).collect(Collectors.toList());
    }

    //wydanie listy ksiazek danego autora wydaych w danym roku o cenie nie wyzszej niz podana
    public List<Book> getListOfBooksOfAuthorInYearWithPriceHigher(String author, Integer price, int year) {
        return books.stream().
                filter(book -> book.getAuthor().equals(author)).
                filter(book -> book.getDate().getYear() == year).
                filter(book -> book.getPrice() > price).collect(Collectors.toList());
    }

    public Integer getPriceByAuthorAndTitle(String author, String title) {
        Integer result = books.stream().filter(book -> book.getAuthor().equals(author)).
                filter(book -> book.getTitle().equals(title))
                .map(book -> book.getPrice()).reduce(0, (price, price2) -> price + price2);
        return moneyLaunderingService.increasePrice(result);
    }


}
