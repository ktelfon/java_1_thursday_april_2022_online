package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.UIAction;

import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.Book;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String title = "";
        String author = "";
        String yearOfIssue = "";
        System.out.println("Enter a book author");
        author = scanner.nextLine();
        System.out.println("Enter a book title");
        title = scanner.nextLine();
        System.out.println("Enter a year of issue");
        yearOfIssue = scanner.nextLine();

        Book book = new Book(author, title, yearOfIssue);
        bookDatabase.save(book);
        // запросите все данные о книге с консоли у пользователя
        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        // сохраните его в базу данных: bookDatabase.save(book);
    }

}
