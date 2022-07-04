package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38;

import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.UIAction.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {
    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("Cat", "Give your cat scritches", "1988");
        Book book2 = new Book("Cat", "A picky eater", "1988");
        Book book3 = new Book("Ishtar", "Press that button", "2020");
        Book book4 = new Book("Cat", "Pur pur pur", "2020");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new FindByYearOfIssueUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new DeleteByAuthor(bookDatabase));
        menuNumberToActionMap.put(10, new AndSearchCriteriaUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new OrSearchCriteriaUIAction(bookDatabase));
    }

    public void run() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Goodbye!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

}
