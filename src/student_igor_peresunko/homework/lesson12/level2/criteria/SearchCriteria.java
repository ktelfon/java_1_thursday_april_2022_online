package student_igor_peresunko.homework.lesson12.level2.criteria;

import student_igor_peresunko.homework.lesson12.level2.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface SearchCriteria {
    boolean match(Book book);
}
