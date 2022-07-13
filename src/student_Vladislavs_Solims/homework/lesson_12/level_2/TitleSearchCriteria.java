package student_Vladislavs_Solims.homework.lesson_12.level_2;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        if(titleToSearch.equals(book.getTitle())){
            return true;
        }else{
            return false;
        }

    }

}
