package student_olga_dubrovskaja.homework.lesson_3.level_4;

//        Найти ошибку в коде.
//        Исправить и запустить программу.
//        Менять можно только класс Book.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {

    String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
