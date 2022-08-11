package student_Vladislavs_Solims.homework.lesson_12.level_2_7.criteria;

import student_Vladislavs_Solims.homework.lesson_12.level_2_7.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface SearchCriteria {

    boolean match(Book book);

}
