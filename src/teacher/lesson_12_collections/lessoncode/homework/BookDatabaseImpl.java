package teacher.lesson_12_collections.lessoncode.homework;

import teacher.lesson_12_collections.lessoncode.homework.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {

    private static Long bookId = 0l;
    private List<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book) {
        bookId++;
        books.add(new Book(book.getTitle(), book.getAuthor(), book.getYearOfIssue(), bookId));
        return bookId;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
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

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                result.add(book);
            }
        }
        return result;
    }
}
