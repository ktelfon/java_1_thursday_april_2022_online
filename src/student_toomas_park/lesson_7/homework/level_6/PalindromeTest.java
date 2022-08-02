package student_toomas_park.lesson_7.homework.level_6;

import static java.util.function.Predicate.isEqual;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.testPalindrome();
    }

    public void testPalindrome(){
        Palindrome palindrome = new Palindrome();
        String word = "lollol";
        boolean expectedResult = true;
        checkResult(expectedResult == palindrome.isPalindrome(word), "Palindrome ");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " Working ");
        } else {
            System.out.println(testName + " Fail ");
        }
    }
}
