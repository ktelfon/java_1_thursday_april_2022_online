package student_olga_dubrovskaja.homework.lesson_4.level_7.task24;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void testResult(boolean result, String testName){
        if (result){
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + "FAIL");
        }
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        int expectedResult = 75;
        Calculator calculator = new Calculator();
        testResult(expectedResult == calculator.sum(firstNumber, secondNumber), "Sum test");
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        testResult(expectedResult == calculator.sub(firstNumber, secondNumber), "Sub test");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        testResult(expectedResult == calculator.mul(firstNumber, secondNumber), "Mul test");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        testResult(expectedResult == calculator.div(firstNumber, secondNumber), "Div test");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean expectedResult = true;
        testResult(expectedResult == calculator.isEven(40), "IsEven test");
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean expectedResult = false;
        testResult(expectedResult == calculator.isEven(41), "IsEven test");
    }
}
