package books;

import java.time.LocalDate;

public class Book {
    private final String author;
    private final String title;
    private final int price;
    private final LocalDate date;

    public Book(String author, String title, int price, LocalDate date) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.date = date;
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price= " + price +
                ", date = '" + date + '\'' +
                '}';
    }
}
