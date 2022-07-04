package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.UIAction;

import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.Book;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book id:");
        Long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println(bookOpt.toString());
        // запросите id книги с консоли у пользователя
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        // выведите на консоль результаты поиска
    }

}
