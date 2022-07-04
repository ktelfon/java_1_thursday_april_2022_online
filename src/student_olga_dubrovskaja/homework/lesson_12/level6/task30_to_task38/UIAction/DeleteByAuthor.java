package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.UIAction;

import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.BookDatabase;

import java.util.Scanner;

public class DeleteByAuthor implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthor(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book author to delete:");
        String author = scanner.nextLine();
        System.out.println("Book " + bookDatabase.findByAuthor(author).toString() + " is deleted");
        bookDatabase.deleteByAuthor(author);

    }
}
