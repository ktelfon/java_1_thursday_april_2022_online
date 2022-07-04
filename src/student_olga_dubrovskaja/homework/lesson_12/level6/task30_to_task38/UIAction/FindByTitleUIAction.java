package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.UIAction;

import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.Book;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.BookDatabase;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.SearchCriteria;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.TitleSearchCriteria;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria(title);
        bookDatabase.find(titleSearchCriteria);
        List<Book> foundBooks = bookDatabase.find(titleSearchCriteria);
        System.out.println(foundBooks.toString());
    }
}
