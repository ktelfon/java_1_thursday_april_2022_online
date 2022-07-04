package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.UIAction;

import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.AndSearchCriteria;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.Book;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.BookDatabase;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.SearchCriteria;

import java.util.List;

public class AndSearchCriteriaUIAction extends ComplexSearchCriteriaUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public AndSearchCriteriaUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        SearchCriteria[] criteria = criteria();
        SearchCriteria andSearchCriteria = new AndSearchCriteria(criteria[0], criteria[1]);
        List<Book> foundBooks = bookDatabase.find(andSearchCriteria);
        System.out.println(foundBooks.toString());
    }
}
