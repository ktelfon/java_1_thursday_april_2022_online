package student_Vladislavs_Solims.homework.lesson_4.level_7.fizz_Buzz;

public class FizzBuzzTest {
    public static void main(String[] args) {
FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
fizzBuzzTest.fizzTest(3);
fizzBuzzTest.buzzTest(5);
fizzBuzzTest.fizzBuzzTest(15);
fizzBuzzTest.nothingTest(4);
    }

    void fizzTest(int number){
        FizzBus fizzBus = new FizzBus();
testResults(fizzBus.detect(number).equals("Fizz") , "Test Fizz");
    }
    void buzzTest(int number){
        FizzBus fizzBus = new FizzBus();
        testResults(fizzBus.detect(number).equals("Buzz") , "Test Buzz");
    }
void fizzBuzzTest(int number){
        FizzBus fizzBus = new FizzBus();
        testResults(fizzBus.detect(number).equals("FizzBuzz") , "test FizzBuzz");
}
void nothingTest(int number){
        FizzBus fizzBus = new FizzBus();
        testResults(fizzBus.detect(number).equals(""+number) , "Nothing test");
}


    private void testResults(boolean condition , String testName) {
        if(condition){
            System.out.println(testName + " = OK");
        }else {
            System.out.println(testName + " = FAIL");
        }
    }

}
