package student_kristina_sapovalova.homework.lesson_3.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Book {

    String title;

    public Book(String bookTitle) {

        this.title = bookTitle;
    }

    String getTitle() {

        return this.title;
    }
}

/* Task_14:
Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Book.

class Book {

    String title

    Book(String bookTitle) {
        this.title = newTitle
    }

    String getTitle() {
        return this.title;
    }

} */
