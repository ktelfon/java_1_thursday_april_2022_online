package student_igor_peresunko.classwork.Exeptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ExceptionsClass {
    public static void main(String[] args) {

        List<String> userNames = List.of("igor", "Evan", "Olga");
        String userThatNeedsToBeSearched;
        if (!userNames.contains(userThatNeedsToBeSearched)) {
            try {
                throw new UserNotFound("No user with name: " + userThatNeedsToBeSearched + " found");
            } catch (UserNotFound e) {
                System.out.println(e.getMessage());
            }
        }


        public static String readFile (String path) throws IOException {
            byte[] bytes = Files.readAllBytes(Path.of(path));
            return new String(bytes);
        }
    }
}
