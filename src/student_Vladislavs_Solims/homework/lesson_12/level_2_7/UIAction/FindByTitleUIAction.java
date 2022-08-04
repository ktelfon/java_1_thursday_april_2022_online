package student_Vladislavs_Solims.homework.lesson_12.level_2_7.UIAction;

import student_Vladislavs_Solims.homework.lesson_12.level_2_7.BookDatabase;

import java.util.Scanner;

public class FindByTitleUIAction implements UIAction{

    private BookDatabase bookDatabase;
    Scanner scanner = new Scanner(System.in);

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Write an book title here - ");
        String title = scanner.next();
        System.out.println(bookDatabase.findByTitle(title));

    }
}
