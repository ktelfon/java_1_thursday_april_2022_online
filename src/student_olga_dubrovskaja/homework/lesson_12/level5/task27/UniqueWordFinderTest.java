package student_olga_dubrovskaja.homework.lesson_12.level5.task27;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.uniqueWordsTest();

    }

    public void uniqueWordsTest() {
        UniqueWordFinder findWords = new UniqueWordFinder();
        String text = "A cute cUte cat ate a tinY tiny mouse";
        Set<String> uniqueWords = findWords.find(text);
        Set<String> expectedResult = new HashSet<>() {{
            add("a");
            add("cute");
            add("cat");
            add("ate");
            add("tiny");
            add("mouse");
        }};
        System.out.println(uniqueWords);
        checkResult(uniqueWords.equals(expectedResult), "unique word test result: ");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
