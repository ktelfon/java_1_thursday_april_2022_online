package student_olga_dubrovskaja.homework.lesson_12.level2.task6_to_task14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {
    private Long bookIdCounter = 0L;
    ArrayList<Book> books;

    BookDatabaseImpl() {
        books = new ArrayList<>();
    }

    @Override
    public Long save(Book book) {
        bookIdCounter++;
        book.setId(bookIdCounter);
        books.add(book);
        return bookIdCounter;
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = books.size() - 1; i >= 0; i--) {
            if (books.get(i).getId().equals(bookId)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {

        if (books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        for (int i = books.size() - 1; i >= 0; i--) {
            if (books.get(i).getAuthor().equals(author)) {
                books.remove(i);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = books.size() - 1; i >= 0; i--) {
            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
            }
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
