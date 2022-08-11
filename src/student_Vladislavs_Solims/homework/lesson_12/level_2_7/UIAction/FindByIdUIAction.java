package student_Vladislavs_Solims.homework.lesson_12.level_2_7.UIAction;

import student_Vladislavs_Solims.homework.lesson_12.level_2_7.Book;
import student_Vladislavs_Solims.homework.lesson_12.level_2_7.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.Optional;
import java.util.Scanner;

@CodeReview(approved = true)
public class FindByIdUIAction implements UIAction{


    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System.in);

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.print("Write a book id here - ");
        long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println(bookOpt.get());
        // запросите id книги с консоли у пользователя
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        // выведите на консоль результаты поиска
    }

}
