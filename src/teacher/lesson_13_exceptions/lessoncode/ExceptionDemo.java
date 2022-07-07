package teacher.lesson_13_exceptions.lessoncode;

import teacher.lesson_13_exceptions.lessoncode.exception.UserNotFound;
import teacher.lesson_13_exceptions.lessoncode.exception.WrongPassword;
import teacher.lesson_13_exceptions.lessoncode.login.LoginService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExceptionDemo {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        try {
            loginService.logIn("Hkajsdf", "asdfsdf");
        } catch (UserNotFound | WrongPassword e) {
            System.out.println(e);
        }
    }

    public static String readFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        return new String(bytes);
    }
}
