package teacher.lesson_13_exceptions.lessoncode.exception;

public class WrongPassword extends Throwable {
    public WrongPassword(String s) {
        super(s);
    }
}
