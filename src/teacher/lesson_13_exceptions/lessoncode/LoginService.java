package teacher.lesson_13_exceptions.lessoncode;

import teacher.lesson_13_exceptions.lessoncode.exception.UserNotFound;

import java.util.List;

public class LoginService {

    private List<String> userNames = List.of("Denis", "Glorija", "Evan");

    public boolean logIn(String userName, String password) throws UserNotFound {
        if(!userNames.contains(userName)){
            throw new UserNotFound("No user with name: " + userName + " found");
        }
        return true;
    }
}
