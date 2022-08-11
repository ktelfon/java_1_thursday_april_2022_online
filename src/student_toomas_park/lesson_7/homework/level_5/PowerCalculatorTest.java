package student_toomas_park.lesson_7.homework.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PowerCalculatorTest {
    public static void main(String[] args){
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.isPowered();
    }
    public void isPowered(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int number = 2;
        int times = 5;
        int expectedResult = 32;
        checkResult(expectedResult == powerCalculator.powerCalc(number, times), "number " + number + " in " + times + " is " + expectedResult + " ");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " Working");
        } else {
            System.out.println(testName + " Fail");
        }
    }
}
