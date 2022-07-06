package student_Vladislavs_Solims.homework.lesson_6.level_7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.shouldReturnFizz();
        fizzBuzzTest.shouldReturnBuzz();
        fizzBuzzTest.shouldReturnFizzBuzz();
        fizzBuzzTest.shouldReturnNothing();

    }

    public void shouldReturnFizz() {
        int num = 6;
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(num).equals(expectedResult), "Should return Fizz test : ");
    }

    public void shouldReturnBuzz() {
        int num = 10;
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(num).equals(expectedResult), "Should Return Buzz test : ");
    }
public void shouldReturnFizzBuzz() {
        int num = 15;
        String expectedRsult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(num).equals(expectedRsult),"Should return FizzBuzz test : ");
}
public void shouldReturnNothing() {
        int num = 7;
        String expectedResult = "" + num;
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(num).equals(expectedResult),"Should return nothing test : ");
}

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "PASSED");
        } else {
            System.out.println(testName + "FAILED");
        }

    }


}
