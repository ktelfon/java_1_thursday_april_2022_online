package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.UIAction;

import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book id to delete:");
        Long id = scanner.nextLong();
        System.out.println("Book " + bookDatabase.findById(id).toString() + " is deleted");
        bookDatabase.delete(id);

    }
}
