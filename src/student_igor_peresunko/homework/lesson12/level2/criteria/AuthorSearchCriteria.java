package student_igor_peresunko.homework.lesson12.level2.criteria;

import student_igor_peresunko.homework.lesson12.level2.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }
}
