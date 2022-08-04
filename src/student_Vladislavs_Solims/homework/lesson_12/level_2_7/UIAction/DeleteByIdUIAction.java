package student_Vladislavs_Solims.homework.lesson_12.level_2_7.UIAction;

import student_Vladislavs_Solims.homework.lesson_12.level_2_7.Book;
import student_Vladislavs_Solims.homework.lesson_12.level_2_7.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction{


    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System.in);

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.print("Write an book id here - ");
        long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        bookDatabase.delete(id);

    }
}
