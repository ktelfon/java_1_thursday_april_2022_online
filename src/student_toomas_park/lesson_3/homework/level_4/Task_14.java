package student_toomas_park.lesson_3.homework.level_4;

public class Task_14 {
    class Book{

        String title;

        Book(String bookTitle) {
            this.title = bookTitle;
        }

        String getTitle() {
            return this.title;
        }

    }

    class BookDemo {

        public void main(String[] args) {
            Book myBook = new Book("Principles");
            String bookTitle = myBook.getTitle();
            System.out.println("Book title = " + bookTitle);
        }

    }
}
