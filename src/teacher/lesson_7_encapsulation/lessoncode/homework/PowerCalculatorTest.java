package teacher.lesson_7_encapsulation.lessoncode.homework;

public class PowerCalculatorTest {

    public static void main(String[] args) {
        positiveNumberTest();
    }

    public static void positiveNumberTest() {
        PowerCalculator calculator = new PowerCalculator();
        double number = 2;
        double power = 2;
        double expected = 4;
        double result = calculator.power(number, power);
        if (result == expected) {
            System.out.println("positiveNumberTest PASSED");
        } else {
            System.out.println("positiveNumberTest FAILED");
            System.out.println("Expected: " + expected + " Actual: " + result);
        }
    }
}
