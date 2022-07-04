package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38;

import java.util.*;

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

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();
        for (Book book : books) {
            uniqueAuthors.add(book.getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitles = new HashSet<>();
        for (Book book : books) {
            uniqueTitles.add(book.getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBooks = new HashSet<>();
        for (Book book : books) {
            uniqueBooks.add(book);
        }
        return uniqueBooks;
    }

    @Override
    public boolean contains(Book book) {
        for (Book aBook : books) {
            if (book.equals(aBook)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorsBooks = new HashMap<>();
        Set<String> uniqueAuthors = findUniqueAuthors();
        for (String author : uniqueAuthors) {
            authorsBooks.put(author, findByAuthor(author));
        }

        return authorsBooks;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorsBookCount = new HashMap<>();
        Set<String> uniqueAuthors = findUniqueAuthors();
        for (String author : uniqueAuthors) {
            authorsBookCount.put(author, findByAuthor(author).size());
        }
        return authorsBookCount;
    }


    public ArrayList<Book> getBooks() {
        return books;
    }

}
