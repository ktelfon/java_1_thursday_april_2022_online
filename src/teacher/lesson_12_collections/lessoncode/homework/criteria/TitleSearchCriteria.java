package teacher.lesson_12_collections.lessoncode.homework.criteria;

import teacher.lesson_12_collections.lessoncode.homework.Book;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }

}
