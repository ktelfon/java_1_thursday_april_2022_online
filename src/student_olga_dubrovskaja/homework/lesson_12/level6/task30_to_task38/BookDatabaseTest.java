package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38;


import java.util.*;

class BookDatabaseTest {
    BookDatabaseImpl bookShelf = new BookDatabaseImpl();


    public static void main(String[] args) {
        BookDatabaseTest test = new BookDatabaseTest();
        Book testBook1 = new Book("Severin Puss", "Why my cat doesn't work", "1988");
        test.matchAuthor(testBook1, "Severin Puss");
        test.noMatchAuthor(testBook1, "Vassili Novak");
        test.matchTitle(testBook1, "Why my cat doesn't work");
        test.noMatchTitle(testBook1, "Spare the sparrow");
        test.matchYearOfIssue(testBook1, "1988");
        test.noMatchYearOfIssue(testBook1, "2000");
        test.matchTitleAndYear(testBook1, "Why my cat doesn't work", "1988");
        test.matchTitleNoMatchYear(testBook1, "Why my cat doesn't work", "2009");
        test.matchTitleORYear1(testBook1, "Why my cat doesn't work", "2009");
        test.matchTitleORYear2(testBook1, "Why my cat doesn't work", "1988");
        test.matchTitleORYearFalse(testBook1, "Spare the sparrow", "2009");
        test.findTestOr();
        test.findTestAnd();
        test.uniqueAuthors();
        test.uniqueTitles();
        test.uniqueBooks();
        test.containsBook();
        test.authorToBooksMap();
        test.eachAuthorBookCount();

    }

    public void matchAuthor(Book book, String author) {
        AuthorSearchCriteria search = new AuthorSearchCriteria(author);
        boolean realResult = search.match(book);
        boolean expectedResult = true;
        checkResult(realResult == expectedResult, "Match author test: ");
    }

    public void noMatchAuthor(Book book, String author) {
        AuthorSearchCriteria search = new AuthorSearchCriteria(author);
        boolean realResult = search.match(book);
        boolean expectedResult = false;
        checkResult(realResult == expectedResult, "No match author test: ");
    }

    public void matchTitle(Book book, String title) {
        TitleSearchCriteria search = new TitleSearchCriteria(title);
        boolean realResult = search.match(book);
        boolean expectedResult = true;
        checkResult(realResult == expectedResult, "Match title test: ");
    }

    public void noMatchTitle(Book book, String title) {
        TitleSearchCriteria search = new TitleSearchCriteria(title);
        boolean realResult = search.match(book);
        boolean expectedResult = false;
        checkResult(realResult == expectedResult, "No match title test: ");
    }

    public void matchYearOfIssue(Book book, String yearOfIssue) {
        YearOfIssueSearchCriteria search = new YearOfIssueSearchCriteria(yearOfIssue);
        boolean realResult = search.match(book);
        boolean expectedResult = true;
        checkResult(realResult == expectedResult, "Match year of issue test: ");
    }

    public void noMatchYearOfIssue(Book book, String yearOfIssue) {
        YearOfIssueSearchCriteria search = new YearOfIssueSearchCriteria(yearOfIssue);
        boolean realResult = search.match(book);
        boolean expectedResult = false;
        checkResult(realResult == expectedResult, "No match year of issue test: ");
    }

    public void matchTitleAndYear(Book book, String title, String yearOfIssue) {
        TitleSearchCriteria searchTitle = new TitleSearchCriteria(title);
        YearOfIssueSearchCriteria searchYear = new YearOfIssueSearchCriteria(yearOfIssue);
        AndSearchCriteria search = new AndSearchCriteria(searchTitle, searchYear);
        boolean realResult = search.match(book);
        boolean expectedResult = true;
        checkResult(realResult == expectedResult, "Match title AND year of issue test: ");
    }

    public void matchTitleNoMatchYear(Book book, String title, String yearOfIssue) {
        TitleSearchCriteria searchTitle = new TitleSearchCriteria(title);
        YearOfIssueSearchCriteria searchYear = new YearOfIssueSearchCriteria(yearOfIssue);
        AndSearchCriteria search = new AndSearchCriteria(searchTitle, searchYear);
        boolean realResult = search.match(book);
        boolean expectedResult = false;
        checkResult(realResult == expectedResult, "Match title, but not year of issue AND test: ");
    }

    public void matchTitleORYear1(Book book, String title, String yearOfIssue) {
        TitleSearchCriteria searchTitle = new TitleSearchCriteria(title);
        YearOfIssueSearchCriteria searchYear = new YearOfIssueSearchCriteria(yearOfIssue);
        OrSearchCriteria search = new OrSearchCriteria(searchTitle, searchYear);
        boolean realResult = search.match(book);
        boolean expectedResult = true;
        checkResult(realResult == expectedResult, "Match title, but not year of issue OR test: ");
    }

    public void matchTitleORYear2(Book book, String title, String yearOfIssue) {
        TitleSearchCriteria searchTitle = new TitleSearchCriteria(title);
        YearOfIssueSearchCriteria searchYear = new YearOfIssueSearchCriteria(yearOfIssue);
        OrSearchCriteria search = new OrSearchCriteria(searchTitle, searchYear);
        boolean realResult = search.match(book);
        boolean expectedResult = true;
        checkResult(realResult == expectedResult, "Match title OR year of issue test (both true): ");
    }

    public void matchTitleORYearFalse(Book book, String title, String yearOfIssue) {
        TitleSearchCriteria searchTitle = new TitleSearchCriteria(title);
        YearOfIssueSearchCriteria searchYear = new YearOfIssueSearchCriteria(yearOfIssue);
        OrSearchCriteria search = new OrSearchCriteria(searchTitle, searchYear);
        boolean realResult = search.match(book);
        boolean expectedResult = false;
        checkResult(realResult == expectedResult, "Match title OR year of issue test (both false): ");
    }

    public void findTestOr() {
        String title = "A picky eater";
        String yearOfIssue = "2020";
        SearchCriteria searchTitle = new TitleSearchCriteria(title);
        SearchCriteria searchYear = new YearOfIssueSearchCriteria(yearOfIssue);
        SearchCriteria searchOr = new OrSearchCriteria(searchTitle, searchYear);
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Ishtar Mushtar", "Give your cat scritches", "2022");
        Book book2 = new Book("Kass the Kaskin", "A picky eater", "2020");
        Book book3 = new Book("Ishtar Mushtar", "Press that button", "2020");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.find(searchOr);
        System.out.println(realResult.toString());
        List<Book> expectedResult = new ArrayList<>() {
            {
                add(book2);
                add(book3);
            }
        };
        checkResult(realResult.equals(expectedResult), "Find OR test : ");
    }

    public void findTestAnd() {
        String title = "A picky eater";
        String yearOfIssue = "2020";
        SearchCriteria searchTitle = new TitleSearchCriteria(title);
        SearchCriteria searchYear = new YearOfIssueSearchCriteria(yearOfIssue);
        SearchCriteria searchAnd = new AndSearchCriteria(searchTitle, searchYear);
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Ishtar Mushtar", "Give your cat scritches", "2022");
        Book book2 = new Book("Kass the Kaskin", "A picky eater", "2020");
        Book book3 = new Book("Ishtar Mushtar", "Press that button", "2020");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.find(searchAnd);
        System.out.println(realResult.toString());
        List<Book> expectedResult = new ArrayList<>() {
            {
                add(book2);
            }
        };
        checkResult(realResult.equals(expectedResult), "Find AND test : ");
    }

    public void uniqueAuthors() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Ishtar Mushtar", "Give your cat scritches", "2022");
        Book book2 = new Book("Kass the Kaskin", "A picky eater", "2020");
        Book book3 = new Book("Ishtar Mushtar", "Press that button", "2020");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> realResult = bookDatabase.findUniqueAuthors();
        System.out.println(realResult.toString());
        Set<String> expectedResult = new HashSet<>() {
            {
                add("Ishtar Mushtar");
                add("Kass the Kaskin");
            }
        };
        checkResult(realResult.equals(expectedResult), "Unique authors test : ");
    }

    public void uniqueTitles() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Ishtar Mushtar", "Give your cat scritches", "2022");
        Book book2 = new Book("Kass the Kaskin", "A picky eater", "2020");
        Book book3 = new Book("Ishtar Mushtar", "Press that button", "2020");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> realResult = bookDatabase.findUniqueTitles();
        System.out.println(realResult.toString());
        Set<String> expectedResult = new HashSet<>() {
            {
                add("Give your cat scritches");
                add("A picky eater");
                add("Press that button");
            }
        };
        checkResult(realResult.equals(expectedResult), "Unique titles test : ");
    }

    public void uniqueBooks() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Ishtar Mushtar", "Give your cat scritches", "2022");
        Book book2 = new Book("Kass the Kaskin", "A picky eater", "2020");
        Book book3 = new Book("Ishtar Mushtar", "Press that button", "2020");
        Book book4 = new Book("Kass the Kaskin", "A picky eater", "2020");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        System.out.println(realResult.toString());
        Set<Book> expectedResult = new HashSet<>() {
            {
                add(book1);
                add(book2);
                add(book3);
                add(book4);
            }
        };
        checkResult(realResult.equals(expectedResult), "Unique books test : ");
    }

    public void containsBook() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Ishtar Mushtar", "Give your cat scritches", "2022");
        Book book2 = new Book("Kass the Kaskin", "A picky eater", "2020");
        Book book3 = new Book("Ishtar Mushtar", "Press that button", "2020");
        Book book4 = new Book("Kass the Kaskin", "A picky eater", "2020");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        boolean realResult = bookDatabase.contains(book1);
        boolean expectedResult = true;
        checkResult(realResult == expectedResult, "Contains book test : ");
    }

    public void authorToBooksMap() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Ishtar Mushtar", "Give your cat scritches", "2022");
        Book book2 = new Book("Kass the Kaskin", "A picky eater", "2020");
        Book book3 = new Book("Ishtar Mushtar", "Press that button", "2020");
        Book book4 = new Book("Kass the Kaskin", "A picky eater", "2020");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Map<String, List<Book>> realResult = bookDatabase.getAuthorToBooksMap();
        List<Book> booksByIshtar = bookDatabase.findByAuthor("Ishtar Mushtar");
        List<Book> booksByKass = bookDatabase.findByAuthor("Kass the Kaskin");
        Map<String, List<Book>> expectedResult = new HashMap<>() {{
            put("Kass the Kaskin", booksByKass);
            put("Ishtar Mushtar", booksByIshtar);
        }};
        System.out.println(realResult);
        System.out.println(expectedResult);
        checkResult(realResult.equals(expectedResult), "Author to book map test : ");
    }

    public void eachAuthorBookCount() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Ishtar Mushtar", "Give your cat scritches", "2022");
        Book book2 = new Book("Kass the Kaskin", "A picky eater", "2020");
        Book book3 = new Book("Ishtar Mushtar", "Press that button", "2020");
        Book book4 = new Book("Kass the Kaskin", "A picky eater", "2020");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Map<String, Integer> realResult = bookDatabase.getEachAuthorBookCount();
        List<Book> booksByIshtar = bookDatabase.findByAuthor("Ishtar Mushtar");
        List<Book> booksByKass = bookDatabase.findByAuthor("Kass the Kaskin");
        Map<String, Integer> expectedResult = new HashMap<>() {{
            put("Kass the Kaskin", booksByKass.size());
            put("Ishtar Mushtar", booksByIshtar.size());
        }};
        System.out.println(realResult);
        System.out.println(expectedResult);
        checkResult(realResult.equals(expectedResult), "Author book count test : ");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }


}
