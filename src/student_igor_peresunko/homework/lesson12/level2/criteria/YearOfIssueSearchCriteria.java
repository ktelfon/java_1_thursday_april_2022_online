package student_igor_peresunko.homework.lesson12.level2.criteria;

import student_igor_peresunko.homework.lesson12.level2.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }

}

