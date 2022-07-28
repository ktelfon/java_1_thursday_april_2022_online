package student_Vladislavs_Solims.homework.lesson_12.level_2_7;

import student_Vladislavs_Solims.homework.lesson_12.level_2_7.criteria.SearchCriteria;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> finUniqueAuthor();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();

    Set<String> find(String text);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);
}
