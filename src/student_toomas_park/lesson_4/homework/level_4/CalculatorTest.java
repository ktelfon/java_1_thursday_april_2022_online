package student_toomas_park.lesson_4.homework.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.res1Test();
        calculatorTest.res2Test();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 7;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("sub test = OK");
        } else {
            System.out.println("sub test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("mul test = OK");
        } else {
            System.out.println("mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("div test = OK");
        } else {
            System.out.println("div test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("even test = OK");
        } else {
            System.out.println("even test = FAIL");
        }
    }
    public void res1Test() {
        int firstNumber = 5;
        int secondNumber = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.res1(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("res1 test = OK");
        } else {
            System.out.println("res1 test = FAIL");
        }
    }
    public void res2Test() {
        int firstNumber = 10;
        int secondNumber = 5;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.res2(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("res2 test = OK");
        } else {
            System.out.println("res2 test = FAIL");
        }
    }
}