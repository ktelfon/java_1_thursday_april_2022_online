package student_olga_dubrovskaja.homework.lesson_4.level_7.task22;

import java.util.Objects;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.testThree(3);
        test.testFive(5);
        test.testThreeAndFive(15);
        test.testNone(4);
    }

    public void testResult(boolean result, String testName){
        if(result){
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL");
        }
    }

    public void testThree(int number){
        String expectedResult = "Fizz";
        FizzBuzz testFizz = new FizzBuzz();
        testResult(expectedResult.equals(testFizz.detect(number)),"Division by 3 test: " );
        }
    public void testFive(int number){
        String expectedResult = "Buzz";
        FizzBuzz testFizz = new FizzBuzz();
        testResult(expectedResult.equals(testFizz.detect(number)),"Division by 5 test: " );
    }

    public void testThreeAndFive(int number){
        String expectedResult = "FizzBuzz";
        FizzBuzz testFizz = new FizzBuzz();
        testResult(expectedResult.equals(testFizz.detect(number)),"Division by 3 and 5 test: " );
    }

    public void testNone(int number){
        String expectedResult = ""+number;
        FizzBuzz testFizz = new FizzBuzz();
        testResult(expectedResult.equals(testFizz.detect(number)),"Neither 3 nor 5 test: " );
    }
}
