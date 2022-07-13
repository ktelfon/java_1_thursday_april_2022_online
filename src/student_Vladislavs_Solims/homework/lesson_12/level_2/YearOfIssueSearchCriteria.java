package student_Vladislavs_Solims.homework.lesson_12.level_2;

public class YearOfIssueSearchCriteria implements SearchCriteria{


    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        if(book.getYearOfIssue().equals(yearOfIssueToSearch)){
            return true;
        }else{
            return false;
        }
        // допишите реализацию метода
        // return true - если год выпуска книги совпадает с this.yearOfIssueToSearch
        // иначе return false
        // добавьте в класс Book новое свойство - yearOfIssue - год выпуска
    }
}
