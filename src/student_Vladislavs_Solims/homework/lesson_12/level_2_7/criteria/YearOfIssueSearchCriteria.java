package student_Vladislavs_Solims.homework.lesson_12.level_2_7.criteria;

import student_Vladislavs_Solims.homework.lesson_12.level_2_7.Book;
import student_Vladislavs_Solims.homework.lesson_12.level_2_7.criteria.SearchCriteria;

public class YearOfIssueSearchCriteria implements SearchCriteria {


    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        if (book.getYearOfIssue().equals(yearOfIssueToSearch)) {
            return true;
        } else {
            return false;
        }
    }
}
