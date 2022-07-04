package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.UIAction;

import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.BookDatabase;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title to delete:");
        String title = scanner.nextLine();
        System.out.println("Book " + bookDatabase.findByTitle(title).toString() + " is deleted");
        bookDatabase.deleteByTitle(title);

    }
}
