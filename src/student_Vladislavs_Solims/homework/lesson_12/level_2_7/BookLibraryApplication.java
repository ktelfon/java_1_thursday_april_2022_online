package student_Vladislavs_Solims.homework.lesson_12.level_2_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BookLibraryApplication {
    final static String MENU = " Enter : (save new book(1)) \n" +
            " (Find book by id(2)) \n" +
            " (Find book by author(3)) \n" +
            " (Find book by title(4)) \n" +
            " (Delete book by id(5)) \n" +
            " If you want to quit press (0)";
    public static void main(String[] args) {

        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.run();
    }

}
