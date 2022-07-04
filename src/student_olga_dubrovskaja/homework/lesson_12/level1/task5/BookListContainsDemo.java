package student_olga_dubrovskaja.homework.lesson_12.level1.task5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("Sapkowski", "The Witcher. The Last Wish");
        Book book2 = new Book("Sapkowski", "The Witcher. Sword of Destiny");

        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("Sapkowski", "The Witcher. The Last Wish");
        boolean containsBook = books.contains(bookInTheList);
        System.out.println(containsBook);

        Book bookNotInTheList = new Book("Sapkowski", "The Witcher. Blood of Elves");
        boolean notContainsBook = books.contains(bookNotInTheList);
        System.out.println(notContainsBook);
    }
}
