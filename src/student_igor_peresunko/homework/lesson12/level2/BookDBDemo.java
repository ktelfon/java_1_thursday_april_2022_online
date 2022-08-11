package student_igor_peresunko.homework.lesson12.level2;

import student_igor_peresunko.homework.lesson12.level2.criteria.*;
import teacher.codereview.CodeReview;

import java.util.Optional;

@CodeReview(approved = true)
public class BookDBDemo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        String authorToSearch = "Kuper";
        String titleToSearch = "Zveroboi";
        String yearOfIssueToSearch = "1890";

        Book book = new Book(authorToSearch, titleToSearch, yearOfIssueToSearch);

        bookDatabase.save(new Book(authorToSearch, titleToSearch, yearOfIssueToSearch));
        bookDatabase.save(new Book("Memuar", "Oden" ,yearOfIssueToSearch));


        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria(authorToSearch);
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria(titleToSearch);
        SearchCriteria year = new YearOfIssueSearchCriteria(yearOfIssueToSearch);
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria,year);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria,new OrSearchCriteria(year,titleSearchCriteria));

        System.out.println(bookDatabase.find(searchCriteria));
        System.out.println(bookDatabase.find(searchCriteria2));
        System.out.println(bookDatabase.find(searchCriteria3));



//              - автор книги "Kuper" и название "Zveroboi"
//                - автор книги "Kuper" и год выпуска 1890
//                - автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"
    }
}
