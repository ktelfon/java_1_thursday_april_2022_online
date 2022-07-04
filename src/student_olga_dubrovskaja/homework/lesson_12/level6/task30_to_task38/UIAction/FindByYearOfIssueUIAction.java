package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.UIAction;

import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.Book;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.BookDatabase;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.SearchCriteria;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.YearOfIssueSearchCriteria;

import java.util.List;
import java.util.Scanner;

public class FindByYearOfIssueUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByYearOfIssueUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book year of issue:");
        String year = scanner.nextLine();
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria(year);
        bookDatabase.find(yearSearchCriteria);
        List<Book> foundBooks = bookDatabase.find(yearSearchCriteria);
        System.out.println(foundBooks.toString());
    }
}
