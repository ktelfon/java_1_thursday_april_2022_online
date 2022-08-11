package student_igor_peresunko.homework.lesson12.level2.criteria;

import student_igor_peresunko.homework.lesson12.level2.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return leftCondition.match(book) && rightCondition.match(book);
    }

}
