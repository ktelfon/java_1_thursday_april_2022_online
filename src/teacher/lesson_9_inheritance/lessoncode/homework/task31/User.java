package teacher.lesson_9_inheritance.lessoncode.homework.task31;

import java.util.Objects;

public class User {

    private String name;
    private String surname;
    private String nickName;
    private String passId;

    public User(String name, String surname, String nickName, String passId) {
        this.name = name;
        this.surname = surname;
        this.nickName = nickName;
        this.passId = passId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassId() {
        return passId;
    }

    public void setPassId(String passId) {
        this.passId = passId;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickName='" + nickName + '\'' +
                ", passId='" + passId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!Objects.equals(name, user.name)) return false;
        if (!Objects.equals(surname, user.surname)) return false;
        if (!Objects.equals(nickName, user.nickName)) return false;
        return Objects.equals(passId, user.passId);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (passId != null ? passId.hashCode() : 0);
        return result;
    }
}
