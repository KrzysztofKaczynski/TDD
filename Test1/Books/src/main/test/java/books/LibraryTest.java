package books;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class LibraryTest {

    private Book book1 = new Book("Stefan", "Fajna", 20, LocalDate.of(2000, 1, 1));
    private Book book2 = new Book("Andrzej", "Słaba", 10, LocalDate.of(1999, 1, 1));
    private Book book3 = new Book("Ewa", "Srednia", 15, LocalDate.of(1980, 2, 3));
    private Book book4 = new Book("Anna", "Kijowa", 1, LocalDate.of(1970, 2, 2));

    private Library library = new Library(Arrays.asList(book1, book2, book3, book4));

    @Test
    public void shouldTrhowIllegalArgumentExceptionWhenBookListIsEmpty() {
        try {
            new Library(new ArrayList<>());
            Assert.fail("books.Library should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("books.Book list cannot not be empty!", e.getMessage());
        }
    }

    @Test
    public void shouldReturnAuthorList() {
        Assert.assertEquals(Arrays.asList(
                book1.getAuthor(),
                book2.getAuthor(),
                book3.getAuthor(),
                book4.getAuthor()), library.getAuthors());

    }

    @Test
    public void shouldReturnTotalPrice() {
        Assert.assertEquals(
                book1.getPrice() +
                        book2.getPrice() +
                        book3.getPrice() +
                        book4.getPrice(), library.getTotalPrices());

    }

    @Test
    public void shouldReturnFormattedAuthors() {
        Assert.assertEquals(
                "- " + book1.getAuthor() + "\n" +
                        "- " + book2.getAuthor() + "\n" +
                        "- " + book3.getAuthor() + "\n" +
                        "- " + book4.getAuthor() + "\n", library.getFormattedAuthors());

    }
}
