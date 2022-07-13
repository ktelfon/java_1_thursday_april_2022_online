package student_Vladislavs_Solims.class_exersizes.lesson_13.task;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

public class ExceptionDemo {


    private List<String> userNames = List.of("Denis", "Glorija", "Evan");
    private List<String> password ;


    public boolean LogIn(String userName, String password) throws UserPrincipalNotFoundException {
        return true;
    }

}
