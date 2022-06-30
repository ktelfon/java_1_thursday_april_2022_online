package student_olga_dubrovskaja.homework.lesson_9.level_7.task_31;

import java.time.LocalDate;

class Book {
    private String title;
    private String author;
    private String publisher;
    private boolean available;
    private boolean overdue;

    User user;
    private LocalDate lendDate;
    private LocalDate returnDate;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.available = true;
        this.overdue = false;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean isOverdue() {
        return overdue;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


}
