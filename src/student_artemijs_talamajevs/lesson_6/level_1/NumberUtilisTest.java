package student_artemijs_talamajevs.lesson_6.level_1;

public class NumberUtilisTest {
    public static void main(String[] args) {
        NumberUtilisTest NumberUtilisTest = new NumberUtilisTest();
        NumberUtilisTest.testIsEven();
    }


    public void  testIsEven() {
        NumberUtils subject = new NumberUtils();
        assertEqual(true, subject.isEven(6), "even");
    }


    public void assertEqual(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println("TEST IS PASSED"+ testName );
        } else {
            System.out.println("FAILLED  IS NOT PASSED'" + testName);
        }
    }
}





