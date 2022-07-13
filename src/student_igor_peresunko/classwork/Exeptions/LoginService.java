package student_igor_peresunko.classwork.Exeptions;

import java.util.List;

public class LoginService {

    private List<User> userNames = List.of(
            new User("Denis", "123qwe123"),
            new User("Igor", "qweqwe12"),
            new User("Vlad", "1q2w3e4r"));


    public boolean logIn(String userName, String password) throws UserNotFound, WrongPassword {
        User tmpUser = new User(userName, password);
        for (User name : userNames) {
            if (!name.equals(tmpUser)) {
                continue;
            }
                if (!name.getPassword().equals(tmpUser.getPassword())) {
                    throw new WrongPassword("WrongPassword");
                }else{
                    return true;
                }
            }

        throw new UserNotFound("No user with name:" + userName + "found",userName);

    }
}
