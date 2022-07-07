package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38;

public interface SearchCriteria {

    Page page = new Page(0,0);
    boolean match(Book book);


}
