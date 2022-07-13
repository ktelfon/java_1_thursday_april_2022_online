package student_igor_peresunko.classwork.Exeptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExceptionDemo {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        try {
            loginService.logIn("Hkajsdf", "asdfsdf");
        } catch (UserNotFound e) {
            System.out.println(e);
        }
    }

    public static String readFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        return new String(bytes);
    }
}
