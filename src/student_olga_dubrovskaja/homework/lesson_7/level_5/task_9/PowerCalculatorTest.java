package student_olga_dubrovskaja.homework.lesson_7.level_5.task_9;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.testPositivePower();
        test.testNegativePower();
        test.testZeroPower();
    }

    public void testPositivePower(){
        PowerCalculator calc = new PowerCalculator();
        int numberToRaise = 2;
        int power = 3;
        double expectedResult = 8;
        checkResult(calc.raiseToThePowerOf(numberToRaise,power) == expectedResult, "Positive power test: ");
    }

    public void testNegativePower(){
        PowerCalculator calc = new PowerCalculator();
        int numberToRaise = 2;
        int power = -3;
        double expectedResult = 0.125;
        checkResult(calc.raiseToThePowerOf(numberToRaise,power) == expectedResult, "Negative power test: ");
    }

    public void testZeroPower(){
        PowerCalculator calc = new PowerCalculator();
        int numberToRaise = 2;
        int power = 0;
        double expectedResult = 1;
        checkResult(calc.raiseToThePowerOf(numberToRaise,power) == expectedResult, "Zero power test: ");
    }


    public void checkResult(boolean condition, String testName){
        if(condition){
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
