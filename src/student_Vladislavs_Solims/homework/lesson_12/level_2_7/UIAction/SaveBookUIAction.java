package student_Vladislavs_Solims.homework.lesson_12.level_2_7.UIAction;

import student_Vladislavs_Solims.homework.lesson_12.level_2_7.Book;
import student_Vladislavs_Solims.homework.lesson_12.level_2_7.BookDatabase;
import student_Vladislavs_Solims.homework.lesson_12.level_2_7.UIAction.UIAction;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write an all info about book \n");
        System.out.print("Title of book \n");
        String title = scanner.next();
        System.out.print("Author \n");
        String author = scanner.next();
        System.out.print("Year of Isuue \n");
        String yearOfIssue = scanner.next();

        bookDatabase.save(new Book(title, author , yearOfIssue));

        // запросите все данные о книге с консоли у пользователя
        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        // сохраните его в базу данных: bookDatabase.save(book);
    }
}
