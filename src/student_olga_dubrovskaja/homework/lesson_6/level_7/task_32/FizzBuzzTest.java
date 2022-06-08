package student_olga_dubrovskaja.homework.lesson_6.level_7.task_32;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.shouldBeFizzBuzz();
        test.shouldBeFizz();
        test.shouldBeBuzz();
        test.shouldBeNone();

    }

    public void shouldBeFizzBuzz() {
        int number = 15;
        String expectedResult = "FizzBuzz";
        FizzBuzz testFizz = new FizzBuzz();
        checkResult(expectedResult.equals(testFizz.detect(number)), "FizzBuzz test:");
    }

    public void shouldBeFizz() {
        int number = 9;
        String expectedResult = "Fizz";
        FizzBuzz testFizz = new FizzBuzz();
        checkResult(expectedResult.equals(testFizz.detect(number)), "Fizz test:");
    }

    public void shouldBeBuzz() {
        int number = 10;
        String expectedResult = "Buzz";
        FizzBuzz testFizz = new FizzBuzz();
        checkResult(expectedResult.equals(testFizz.detect(number)), "Buzz test:");
    }

    public void shouldBeNone() {
        int number = 8;
        String expectedResult = "8";
        FizzBuzz testFizz = new FizzBuzz();
        checkResult(expectedResult.equals(testFizz.detect(number)), "Not a FizzBuzz test:");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }
}
