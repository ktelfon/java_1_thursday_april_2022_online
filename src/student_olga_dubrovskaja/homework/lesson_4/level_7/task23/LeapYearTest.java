package student_olga_dubrovskaja.homework.lesson_4.level_7.task23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.testNotDivisibleBy4(2021);
        leapYearTest.testNotDivisibleBy100(2024);
        leapYearTest.testDivisibleBy400(2000);
        leapYearTest.testNotDivisibleBy400(1900);
    }

    public void testResult(boolean result, String testName){
        if(result){
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL");
        }
    }
    public void testNotDivisibleBy4(int year){
        boolean expectedResult = false;
        LeapYear leapYear = new LeapYear();
        testResult(expectedResult == leapYear.isLeap(year), "Year is not divisible by 4 test:" );
    }
    public void testNotDivisibleBy100(int year){
        boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        testResult(expectedResult == leapYear.isLeap(year), "Year is divisible by 4 and not divisible by 100 test: " );
    }

    public void testDivisibleBy400(int year){
        boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        testResult(expectedResult == leapYear.isLeap(year), "Year is divisible by 400 test: " );
    }
    public void testNotDivisibleBy400(int year){
        boolean expectedResult = false;
        LeapYear leapYear = new LeapYear();
        testResult(expectedResult == leapYear.isLeap(year), "Year is not divisible by 400 test: " );
    }
}
