package student_Vladislavs_Solims.homework.lesson_12.level_2_7.UIAction;

import student_Vladislavs_Solims.homework.lesson_12.level_2_7.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class FindByAuthorUIAction implements UIAction{

    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System.in);

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Write an author Name here - ");
        String author = scanner.next();
        System.out.println(bookDatabase.findByAuthor(author));

    }
}
