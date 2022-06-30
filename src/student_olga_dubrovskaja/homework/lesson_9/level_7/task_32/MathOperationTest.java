package student_olga_dubrovskaja.homework.lesson_9.level_7.task_32;

class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();
        test.testAddition(5, 10);
        test.testSubtraction(5, 10);
        test.testDivision(5, 10);
        test.testMultiplication(5, 10);

    }

    public void testAddition(double firstNumber, double secondNumber) {
        Argument arg1 = new Argument(firstNumber);
        Argument arg2 = new Argument(secondNumber);
        MathOperation add = new Addition(arg1, arg2);
        double expectedResult = firstNumber + secondNumber;
        double realResult = add.calculate();
        checkResult(expectedResult == realResult, " Addition test:");
    }

    public void testSubtraction(double firstNumber, double secondNumber) {
        Argument arg1 = new Argument(firstNumber);
        Argument arg2 = new Argument(secondNumber);
        MathOperation subtraction = new Subtraction(arg1, arg2);
        double expectedResult = firstNumber - secondNumber;
        double realResult = subtraction.calculate();
        checkResult(expectedResult == realResult, " Subtraction test:");
    }

    public void testDivision(double firstNumber, double secondNumber) {
        Argument arg1 = new Argument(firstNumber);
        Argument arg2 = new Argument(secondNumber);
        MathOperation division = new Division(arg1, arg2);
        double expectedResult = firstNumber / secondNumber;
        double realResult = division.calculate();
        checkResult(expectedResult == realResult, " Division test:");
    }

    public void testMultiplication(double firstNumber, double secondNumber) {
        Argument arg1 = new Argument(firstNumber);
        Argument arg2 = new Argument(secondNumber);
        MathOperation multi = new Multiplication(arg1, arg2);
        double expectedResult = firstNumber * secondNumber;
        double realResult = multi.calculate();
        checkResult(expectedResult == realResult, " Multiplication test:");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
