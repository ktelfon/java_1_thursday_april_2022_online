package student_olga_dubrovskaja.homework.lesson_7.level_6.task_11;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.testPalindrome();
        test.testLongerPalindrome();
        test.testIgnoreCase();
        test.testNotAPalindrome();

    }

    public void testPalindrome() {
        Palindrome pal = new Palindrome();
        String text = "racecar";
        boolean expectedResult = true;
        checkResult(expectedResult == pal.isPalindrome(text), "Palindrome simple test");
    }

    public void testLongerPalindrome() {
        Palindrome pal = new Palindrome();
        String text = "sum summus mus";
        boolean expectedResult = true;
        checkResult(expectedResult == pal.isPalindrome(text), "Palindrome longer test");
    }

    public void testIgnoreCase() {
        Palindrome pal = new Palindrome();
        String text = "sum sumMUS mus";
        boolean expectedResult = true;
        checkResult(expectedResult == pal.isPalindrome(text), "Palindrome ignore case test");
    }

    public void testNotAPalindrome() {
        Palindrome pal = new Palindrome();
        String text = "cat sleeps on a table";
        boolean expectedResult = false;
        checkResult(expectedResult == pal.isPalindrome(text), "Not a palindrome test");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
