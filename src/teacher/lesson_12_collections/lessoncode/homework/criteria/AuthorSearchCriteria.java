package teacher.lesson_12_collections.lessoncode.homework.criteria;

import teacher.lesson_12_collections.lessoncode.homework.Book;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }
}
