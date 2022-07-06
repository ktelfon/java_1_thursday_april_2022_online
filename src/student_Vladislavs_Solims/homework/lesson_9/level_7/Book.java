package student_Vladislavs_Solims.homework.lesson_9.level_7;

import java.time.LocalDateTime;

public class Book {

    private String author;
    private String name;
    private String publisher;
    private User rervedBy;
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
        this.rervedBy = user;
    }

    public boolean isReserved() {
        return rervedBy != null;
    }

    public void take(LocalDateTime taken, LocalDateTime returnDate) {
        this.timeTaken = taken;
        this.timeToReturn = returnDate;
    }

    public void bringBack() {
        this.timeToReturn = null;
        this.timeTaken = null;
    }

    public boolean isTaken(){
      return this.timeTaken != null && this.timeToReturn != null;
    }

}
