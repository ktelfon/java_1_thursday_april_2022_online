package student_Vladislavs_Solims.homework.lesson_12.level_2_7;

import student_Vladislavs_Solims.homework.lesson_12.level_2_7.criteria.SearchCriteria;
import teacher.codereview.CodeReview;

import java.util.*;
import java.util.stream.Collectors;

@CodeReview(approved = true)
public class BookDatabaseImpl implements BookDatabase {

    private static Long bookId = 0l;
    private List<Book> books = new ArrayList<>();
    private List<Integer> counting = new ArrayList<>();

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
        Set<String> result = new HashSet<>();
        for (Book book : books) {
            result.add(book.getAuthor());
        }
        return result;
    }


    @Override
    public Set<String> findUniqueTitles() {
        Set<String> result = new HashSet<>();
        for (Book book : books) {
            result.add(book.getTitle());
        }
        return result;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> result = new HashSet<>();
        for (Book book : books) {
            result.add(book);
        }
        return result;
    }

    @Override
    public boolean contains(Book book) {
        for (Book book1 : books) {
            if (book1.getTitle() == book.getTitle()) {
                return true;
            } else {

            }

        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> result = new HashMap<>();
        for (Book book : books) {
            String author = book.getAuthor();
            List<Book> bookByAuthor = result.getOrDefault(author, new ArrayList<>());
            bookByAuthor.add(book);
            result.put(author, bookByAuthor);
        }

        return result;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> result = new HashMap<>();
        for (Book book : books) {
            String author = book.getAuthor();
            Integer amountOfBooks = result.getOrDefault(author, 0);
            result.put(author, ++amountOfBooks);
        }
        return result;
    }

    @Override
    public Set<String> find(String text) {
        Set<String> result = new HashSet<>();
        for (Book book : books) {
            if (text.equals(book.getAuthor())) {
                result.add(book.getTitle());
                result.add(book.getAuthor());
                System.out.println();
            } else if (text.equals(book.getTitle())) {
                result.add(book.getTitle());
                result.add(book.getAuthor());
                System.out.println();
            } else if (text.equals(book.getYearOfIssue())) {
                result.add(book.getTitle());
                result.add(book.getAuthor());
                System.out.println();
            }
        }
        return result;
    }

    @Override
    public int countAllBooks() {
        int result = 0;
        for (int i = 0; i <= books.size(); i++) {
            result = i;
        }
        return result;
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
