package student_igor_peresunko.homework.lesson12.level2;

import student_igor_peresunko.homework.lesson12.level2.criteria.SearchCriteria;

import java.util.List;
import java.util.Optional;

public interface BookDatabase {

    Long save(Book book);
    boolean delete(Long bookId);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);
}
