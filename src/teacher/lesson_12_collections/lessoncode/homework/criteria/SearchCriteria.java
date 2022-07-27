package teacher.lesson_12_collections.lessoncode.homework.criteria;

import teacher.lesson_12_collections.lessoncode.homework.Book;

public interface SearchCriteria {
    boolean match(Book book);
}
