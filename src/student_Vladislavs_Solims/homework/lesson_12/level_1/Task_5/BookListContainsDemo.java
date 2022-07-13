package student_Vladislavs_Solims.homework.lesson_12.level_1.Task_5;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("Dmitrij Gluhovskij" , "Metro");
        Book book2 = new Book("Gerbert Shildt" , "Java for the beginers");

        books.add(book1);
        books.add(book2);

        for( Book book : books){
            System.out.println(books);
        }

        Book bookInTheList = new Book("Dmitrij Gluhovskij" , "Metro");
        boolean containsBook = books.contains(bookInTheList);
        System.out.println("There is it " + containsBook);

        Book bookNotContains = new Book("abcd" , "Azbuka");
        boolean notContainsBook = books.contains(bookNotContains);
        System.out.println( notContainsBook);

    }
}
