package student_Vladislavs_Solims.homework.lesson_12.level_2_7.criteria;

import student_Vladislavs_Solims.homework.lesson_12.level_2_7.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        if(authorToSearch.equals(book.getAuthor())){
            return true;
        }else{
            return false;
        }
    }
}
