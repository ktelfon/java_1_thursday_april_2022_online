package student_igor_peresunko.classwork.Exeptions;

public class UserNotFound extends Exception {

    private String wrongUserName;

    public UserNotFound(String message,String username) {
        super(message);
        this.wrongUserName = username;
    }

    public String getWrongUserName() {
        return wrongUserName;
    }
}
