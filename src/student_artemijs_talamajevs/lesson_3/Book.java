package student_artemijs_talamajevs.lesson_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Book {
    String title;

    Book(String bookTitle) {
        this.title =bookTitle;
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
