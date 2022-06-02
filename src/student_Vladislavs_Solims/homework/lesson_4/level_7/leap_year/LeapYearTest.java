package student_Vladislavs_Solims.homework.lesson_4.level_7.leap_year;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.testLeapYear(2004);
        leapYearTest.testCentury(2100);
        leapYearTest.testLEapCentury(2000   );
        leapYearTest.testSympleYear(2003);
    }

    void testResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL");
        }
    }

    void testLeapYear(int number) {
        LeapYear leapYear = new LeapYear();
        testResult(leapYear.checkLeap(number).equals("Leap year"), "test Leap Year");
    }

    void testCentury(int number) {
        LeapYear leapYear = new LeapYear();
        testResult(leapYear.checkLeap(number).equals("century"), "Test Century");
    }

    void testLEapCentury(int number) {
        LeapYear leapYear = new LeapYear();
        testResult(leapYear.checkLeap(number).equals("Leap century"), "Test Leap Century");
    }

    void testSympleYear(int number) {
        LeapYear leapYear = new LeapYear();
        testResult(leapYear.checkLeap(number).equals("Symple year"), "Test Symple Year");
    }

}
