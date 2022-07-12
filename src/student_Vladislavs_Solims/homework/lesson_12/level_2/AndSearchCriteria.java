package student_Vladislavs_Solims.homework.lesson_12.level_2;

public class AndSearchCriteria implements SearchCriteria{

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        if(book.equals(leftCondition) && (book.equals(rightCondition))){
            return true;
        }else{
            return false;
        }
        // допишите реализацию метода
        // return true - если книга удовлетворяет и левому и правому условию
        // иначе return false
    }
}
