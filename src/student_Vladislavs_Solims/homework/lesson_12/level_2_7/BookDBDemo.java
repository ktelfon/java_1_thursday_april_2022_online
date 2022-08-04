package student_Vladislavs_Solims.homework.lesson_12.level_2_7;

import student_Vladislavs_Solims.homework.lesson_12.level_2_7.criteria.*;

import java.util.Optional;

public class BookDBDemo {
    public static void main(String[] args) {
        String authorToSearch = "Kuper";
        String titleToSearch = "Zveroboj";
        String yearToSearch = "2020";


        BookDatabase bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(new Book("Zveroboj", "Kuper", "2020"));
        long id = bookDatabase.save(new Book("History", "Vlad", "2000"));
        bookDatabase.save(new Book("Krutoj", "Vlad", "2022"));
        bookDatabase.save(new Book("Vlastj", "Vlad", "2022"));
        bookDatabase.save(new Book("Privet", "Vlad", "2022"));


        System.out.println(id);
        Optional<Book> o = bookDatabase.findById(id);
        System.out.println(o.get());
        System.out.println(bookDatabase.findByAuthor("Vlad"));
        System.out.println(bookDatabase.delete(id));


        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria(authorToSearch);
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria(titleToSearch);
        SearchCriteria year = new YearOfIssueSearchCriteria(yearToSearch);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, year);
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, new OrSearchCriteria(year, titleSearchCriteria));

        System.out.println(bookDatabase.find(searchCriteria));
        System.out.println(bookDatabase.find(searchCriteria2));
        System.out.println(bookDatabase.find(searchCriteria3));
        System.out.println();

        bookDatabase.contains(new Book("Kuper", "Zveroboj", "2020"));
        System.out.println(bookDatabase.find("Vlad"));
        System.out.println(bookDatabase.countAllBooks());
        System.out.println();
        System.out.println(bookDatabase.getAuthorToBooksMap("Vlad"));
        System.out.println();
        System.out.println(bookDatabase.getEachAuthorBookCount("Vlad"));

    }
}
