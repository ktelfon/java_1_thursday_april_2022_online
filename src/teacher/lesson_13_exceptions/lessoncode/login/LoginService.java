package teacher.lesson_13_exceptions.lessoncode.login;

import teacher.lesson_13_exceptions.lessoncode.exception.UserNotFound;
import teacher.lesson_13_exceptions.lessoncode.exception.WrongPassword;

import java.util.List;

public class LoginService {

    private List<User> userNames = List.of(
            new User("Deniss", "123qwe123"),
            new User("Evan", "qweqwe12"),
            new User("Glorija", "1q2w3e4r")
    );

    public boolean logIn(String userName, String password) throws UserNotFound, WrongPassword {
        User tmpUser = new User(userName, password);
        for (User name : userNames) {
            if (!name.equals(tmpUser)) {
                continue;
            }
            if (!name.getPassword().equals(tmpUser.getPassword())) {
                throw new WrongPassword("Wrong password!");
            } else {
                return true;
            }
        }
        throw new UserNotFound("No user with name: " + userName + " found", userName);
    }
}
