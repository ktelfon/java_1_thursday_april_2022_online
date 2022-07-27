package teacher.lesson_13_exceptions.lessoncode.homework;

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

    public String getFullName() {
        return fullName;
    }
}
