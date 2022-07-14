package student_Vladislavs_Solims.homework.lesson_12.level_2;

public class SearchCriteriaDemo {

    SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
    SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
    SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

}
