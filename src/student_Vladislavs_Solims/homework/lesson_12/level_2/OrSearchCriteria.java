package student_Vladislavs_Solims.homework.lesson_12.level_2;

public class OrSearchCriteria  implements  SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        if (book.equals(leftCondition) && (book.equals(rightCondition))) {
            return true;
        } else {
            return false;
        }
    }
}
