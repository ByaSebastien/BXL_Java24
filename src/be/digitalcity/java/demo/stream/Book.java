package be.digitalcity.java.demo.stream;

import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private int pages;
    private LocalDate publicationDate;

    public Book(String title, String author, int pages, LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
