package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.UIAction;

import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.AuthorSearchCriteria;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.Book;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.BookDatabase;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.SearchCriteria;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria(author);
        bookDatabase.find(authorSearchCriteria);
        List<Book> foundBooks = bookDatabase.find(authorSearchCriteria);
        System.out.println(foundBooks.toString());
    }
}
