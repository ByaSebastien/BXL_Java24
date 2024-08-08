package be.digitalcity.java.demo.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {

    public static List<Book> books = List.of(
            new Book("L'art de la guerre", "Sun tzu", 300, LocalDate.of(0, 3, 27)),
            new Book("Martine à la cantine", "Martine", 200, LocalDate.of(1990, 3, 27)),
            new Book("Martine à la guerre", "Martine", 100, LocalDate.of(2000, 5, 27)),
            new Book("Tintin au tibet", "Herge", 150, LocalDate.of(1995, 3, 13)),
            new Book("Tintin et les bijoux de la castafiore", "Herge", 50, LocalDate.of(2001, 5, 12))
    );

    public static void main(String[] args) {

        books.forEach(System.out::println);
        System.out.println("____________________________________________");

        List<String> filteredBooks = books.stream()
                .filter(b -> b.getAuthor().equals("Herge"))
                .map(b -> b.getTitle())
                .limit(1)
                .toList();

        filteredBooks.forEach(System.out::println);
    }


}
