package student_olga_dubrovskaja.homework.lesson_12.level2.task6_to_task14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseTest {
    BookDatabaseImpl bookShelf = new BookDatabaseImpl();

    public static void main(String[] args) {
        BookDatabaseTest test = new BookDatabaseTest();
        test.testSaveBook();
        test.deleteBookByID();
        test.deleteBookWrongId();
        test.deleteBookObject();
        test.deleteBookWrongObject();
        test.findById();
        test.findByWrongId();
        test.findByAuthor();
        test.findByTitle();
        test.countAllBooks();
        test.deleteByAuthor();
        test.deleteByTitle();

    }

    public void testSaveBook() {
        Book book1 = new Book("Severin Puss", "How to shave a kitten");
        Long newBookId = bookShelf.save(book1);
        System.out.println(bookShelf.getBooks().get(0).toString());
        System.out.println(book1.getId().toString() + " " + newBookId);
        checkResult(book1.getId().equals(newBookId), "Save book test: ");
    }

    public void deleteBookByID() {
        boolean realResult = bookShelf.delete(1L);
        boolean expectedResult = true;
        checkResult(realResult == expectedResult, "Delete book test: ");

    }

    public void deleteBookWrongId() {
        boolean realResult = bookShelf.delete(2L);
        boolean expectedResult = false;
        checkResult(realResult == expectedResult, "Delete book wrong ID test: ");
    }

    public void deleteBookObject() {
        Book book1 = new Book("Severin Puss", "How to shave a kitten");
        bookShelf.save(book1);
        boolean realResult = bookShelf.delete(book1);
        boolean expectedResult = true;
        checkResult(realResult == expectedResult, "Delete book object test: ");
    }

    public void deleteBookWrongObject() {
        Book book1 = new Book("Severin Puss", "Never to late to poop");
        bookShelf.save(book1);
        Book book2 = new Book("Vassili Novak", "Secrets of sad crows");
        boolean realResult = bookShelf.delete(book2);
        boolean expectedResult = false;
        checkResult(realResult == expectedResult, "Delete wrong book test: ");
    }

    public void findById() {
        Book book1 = new Book("Vassili Novak", "I don't know, where boots come from");
        bookShelf.save(book1);
        Optional<Book> realResult = bookShelf.findById(book1.getId());
        Optional<Book> expectedResult = Optional.of(book1);
        System.out.println(book1.getId());
        checkResult(realResult.equals(expectedResult), "Find book by ID test: ");
    }

    public void findByWrongId() {
        Book book1 = new Book("Severin Puss", "How to shave a kitten");
        bookShelf.save(book1);
        Optional<Book> realResult = bookShelf.findById(100L);
        Optional<Book> expectedResult = Optional.empty();
        checkResult(realResult.equals(expectedResult), "Find book by wrong ID test: ");
    }

    public void findByAuthor() {
        Book book1 = new Book("Severin Puss", "Survive a breakfast");
        Book book2 = new Book("Severin Puss", "Don't mess with squirrels");
        Book book3 = new Book("Arkadi Popov", "One thousand and one reason to grow potatoes");
        BookDatabaseImpl otherBookShelf = new BookDatabaseImpl();
        otherBookShelf.save(book1);
        otherBookShelf.save(book2);
        otherBookShelf.save(book3);
        List<Book> booksByAuthor = otherBookShelf.findByAuthor("Severin Puss");
        List<Book> expectedResult = new ArrayList<>() {
            {
                add(book1);
                add(book2);
            }
        };
        System.out.println(booksByAuthor);
        checkResult(booksByAuthor.equals(expectedResult), "Find book by author test: ");
    }

    public void findByTitle() {
        Book book1 = new Book("Severin Puss", "Survive a breakfast");
        Book book2 = new Book("Severin Puss", "Don't mess with squirrels");
        Book book3 = new Book("Arkadi Popov", "One thousand and one reason to grow potatoes");
        BookDatabaseImpl otherBookShelf = new BookDatabaseImpl();
        otherBookShelf.save(book1);
        otherBookShelf.save(book2);
        otherBookShelf.save(book3);
        List<Book> booksByTitle = otherBookShelf.findByTitle("Don't mess with squirrels");
        List<Book> expectedResult = new ArrayList<>() {
            {
                add(book2);
            }
        };
        System.out.println(booksByTitle);
        checkResult(booksByTitle.equals(expectedResult), "Find book by title test: ");
    }

    public void countAllBooks() {
        Book book1 = new Book("Severin Puss", "Survive a breakfast");
        Book book2 = new Book("Severin Puss", "Don't mess with squirrels");
        Book book3 = new Book("Arkadi Popov", "One thousand and one reason to grow potatoes");
        BookDatabaseImpl otherBookShelf = new BookDatabaseImpl();
        otherBookShelf.save(book1);
        otherBookShelf.save(book2);
        otherBookShelf.save(book3);
        int expectedResult = 3;
        int realResult = otherBookShelf.countAllBooks();
        checkResult(expectedResult == realResult, "Count all books test: ");
    }

    public void deleteByAuthor() {
        Book book1 = new Book("Severin Puss", "Survive a breakfast");
        Book book2 = new Book("Severin Puss", "Don't mess with squirrels");
        Book book3 = new Book("Arkadi Popov", "One thousand and one reason to grow potatoes");
        BookDatabaseImpl otherBookShelf = new BookDatabaseImpl();
        otherBookShelf.save(book1);
        otherBookShelf.save(book2);
        otherBookShelf.save(book3);
        otherBookShelf.deleteByAuthor("Severin Puss");
        List<Book> expectedResult = new ArrayList<>() {
            {
                add(book3);
            }
        };
        checkResult(otherBookShelf.getBooks().equals(expectedResult), "Delete book by author test: ");

    }

    public void deleteByTitle() {
        Book book1 = new Book("Severin Puss", "Survive a breakfast");
        Book book2 = new Book("Severin Puss", "Don't mess with squirrels");
        Book book3 = new Book("Arkadi Popov", "One thousand and one reason to grow potatoes");
        BookDatabaseImpl otherBookShelf = new BookDatabaseImpl();
        otherBookShelf.save(book1);
        otherBookShelf.save(book2);
        otherBookShelf.save(book3);
        otherBookShelf.deleteByTitle("Survive a breakfast");
        List<Book> expectedResult = new ArrayList<>() {
            {
                add(book2);
                add(book3);
            }
        };
        checkResult(otherBookShelf.getBooks().equals(expectedResult), "Delete book by title test: ");

    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }

    public void createBookShelf() {

    }
}
