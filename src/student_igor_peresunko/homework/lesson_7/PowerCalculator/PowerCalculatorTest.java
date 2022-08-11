package student_igor_peresunko.homework.lesson_7.PowerCalculator;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Empty main")
public class PowerCalculatorTest {
    public static void main(String[] args) {

    }

    public static void positiveNumberTest(){
        PowerCalculator calculator = new PowerCalculator();
        double number = 2;
        double power = 2;
        double expected = 4;
        double result = calculator.power(number,power);
        if (result == expected){
            System.out.println("positiveNumberTest Passed");
        }else{
            System.out.println("positiveNumberTest Failed");
            System.out.println("Expected: " + expected + "Actual: " + result);
        }
    }
}
