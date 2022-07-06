package student_Vladislavs_Solims.homework.lesson_7.level_5;

public class PowerCalculatorTest {
    public static void main(String[] args) {
PowerCalculatorTest.positiveNumberTest();
    }

    public static  void positiveNumberTest(){
        PowerCalculator powerCalculator = new PowerCalculator();
        double number = 2;
        double power = 2;
        double expectedResult = 4;
        double result = powerCalculator.power(number,power);
        if(result == expectedResult){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Expected : "+ expectedResult + "Actual " + result);
        }
    }


}
