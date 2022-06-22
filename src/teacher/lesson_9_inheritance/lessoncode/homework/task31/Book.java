package teacher.lesson_9_inheritance.lessoncode.homework.task31;

import java.time.LocalDateTime;

public class Book {

    private String author;
    private String name;
    private String publisher;
    private User reservedBy;
    private LocalDateTime timeTaken;
    private LocalDateTime timeToReturn;

    public Book(String author, String name, String publisher) {
        this.author = author;
        this.name = name;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void reserve(User user) {
        this.reservedBy = user;
    }

    public boolean isReserved() {
        return reservedBy != null;
    }

    public void take(LocalDateTime taken, LocalDateTime returnDate) {
        this.timeTaken = taken;
        this.timeToReturn = returnDate;
    }

    public void bringBack() {
        this.timeToReturn = null;
        this.timeTaken = null;
    }

    public boolean isTaken() {
        return this.timeTaken != null && this.timeToReturn != null;
    }

}
