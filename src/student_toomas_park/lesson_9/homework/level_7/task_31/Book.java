package student_toomas_park.lesson_9.homework.level_7.task_31;

import java.sql.Date;

public class Book {
    private String title;
    private String ticket;
    private Date returnDate;
    private boolean reserved;
    private User user;

    public Book() {
    }

    public Book(String title, String ticket, Date returnDate, boolean reserved, User user) {
        this.title = title;
        this.ticket = ticket;
        this.returnDate = returnDate;
        this.reserved = reserved;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
