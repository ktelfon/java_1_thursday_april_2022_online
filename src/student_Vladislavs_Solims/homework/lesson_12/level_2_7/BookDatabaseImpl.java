package student_Vladislavs_Solims.homework.lesson_12.level_2_7;

import student_Vladislavs_Solims.homework.lesson_12.level_2_7.criteria.SearchCriteria;

import java.util.*;

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
    public boolean delete(Book book) {
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
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public Set<String> finUniqueAuthor() {
        return null;
    }


    @Override
    public Set<String> findUniqueTitles() {
        return null;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return null;
    }

    @Override
    public boolean contains(Book book) {
        for(Book book1 : books) {
            if(book1.getTitle()==book.getTitle()){
                return true;
            }else{

            }

        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        return null;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        return null;
    }

    @Override
    public Set<String> find(String text) {
        return null;
    }

    @Override
    public int countAllBooks() {
        return 0;
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
}
