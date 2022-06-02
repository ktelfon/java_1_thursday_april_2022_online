package student_olegs_liliks.homework.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.oddNumberTest();
        calculatorTest.evenNumberTest();
        calculatorTest.maxOfTwoNumbersFirst();
        calculatorTest.maxOfTwoNumbersSecond();
        calculatorTest.maxOfTwoNumbersEqual();
        calculatorTest.maxOfThreeNumbersFirst();
        calculatorTest.maxOfThreeNumbersSecond();
        calculatorTest.maxOfThreeNumbersThird();
        calculatorTest.maxOfThreeNumbersFirstSecondMax();
        calculatorTest.maxOfThreeNumbersFirstSecondThirdEqual();

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
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void evenNumberTest() {
        int number = 4;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("EvenNumber test = OK");
        } else {
            System.out.println("EvenNumber test = FAIL");
        }
    }
    public void oddNumberTest() {
        int number = 3;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("OddNumber test = OK");
        } else {
            System.out.println("OddNumber test = FAIL");
        }
    }
    public void maxOfTwoNumbersFirst() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersFirst test = OK");
        } else {
            System.out.println("maxOfTwoNumbersFirst test = FAIL");
        }
    }
    public void maxOfTwoNumbersSecond() {
        int firstNumber = 4;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersSecond test = OK");
        } else {
            System.out.println("maxOfTwoNumbersSecond test = FAIL");
        }
    }
    public void maxOfTwoNumbersEqual() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersEqual test = OK");
        } else {
            System.out.println("maxOfTwoNumbersEqual test = FAIL");
        }
    }
    public void maxOfThreeNumbersFirst() {
        int firstNumber = 5;
        int secondNumber = 3;
        int thirdNumber = 2;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersFirst test = OK");
        } else {
            System.out.println("maxOfTwoNumbersFirst test = FAIL");
        }
    }
    public void maxOfThreeNumbersSecond() {
        int firstNumber = 5;
        int secondNumber = 6;
        int thirdNumber = 2;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersSecond test = OK");
        } else {
            System.out.println("maxOfTwoNumbersSecond test = FAIL");
        }
    }
    public void maxOfThreeNumbersThird() {
        int firstNumber = 5;
        int secondNumber = 6;
        int thirdNumber = 9;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersThird test = OK");
        } else {
            System.out.println("maxOfTwoNumbersThird test = FAIL");
        }
    }
    public void maxOfThreeNumbersFirstSecondMax() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 9;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersFirstSecondMax test = OK");
        } else {
            System.out.println("maxOfTwoNumbersFirstSecondMax test = FAIL");
        }
    }
    public void maxOfThreeNumbersFirstSecondThirdEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersFirstSecondThird test = OK");
        } else {
            System.out.println("maxOfTwoNumbersFirstSecondThird test = FAIL");
        }
    }
}