package student_igor_peresunko.homework.lesson13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BankClient {

    private String uid;      // уникальный идентификатор клиента
    private String fullName; // полное имя клиента

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // создайте конструктор класса, в котором вы получите значения указанных свойств

    // создайте get() методы для каждого из свойств
}
