package student_igor_peresunko.classwork.Exeptions;

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
