package student_igor_peresunko.homework.lesson12.level2.criteria;

import student_igor_peresunko.homework.lesson12.level2.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }

}


