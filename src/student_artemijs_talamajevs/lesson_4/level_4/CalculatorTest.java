package student_artemijs_talamajevs.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.multiTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest_1();
        calculatorTest.maxOfTwoNumbersTest_2();
        calculatorTest.maxOfTwoNumbersTest_3();
        calculatorTest.maxOfThreeNumbersTest_1();
        // по аналогии реализуйте тесты для остальных методов
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
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

    public void multiTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multi(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multi test = OK");
        } else {
            System.out.println("Multi test = FAIL");
        }

    }

    public void isEvenTest() {
        int number = 4;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Is Even test=OK");
        } else {
            System.out.println("Is Even test=FAIL");
        }

    }
    public void maxOfTwoNumbersTest_1(){
        int firstNumber=10;
        int secondNumber=5;
        int expectedResult=10;
        Calculator calculator=new Calculator();
        int realResult= calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (realResult==expectedResult){
            System.out.println("maxOfTwoNumbersTest_1=OK");
        }
        else {
            System.out.println("maxOfTwoNumbersTest_1=FAIL");
        }
    }
    public void maxOfTwoNumbersTest_2() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest_2=OK");
        } else {
            System.out.println("maxOfTwoNumbersTest_2=FAIL");
        }
    }
    public void maxOfTwoNumbersTest_3() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest_3=OK");
        } else {
            System.out.println("maxOfTwoNumbersTest_3=FAIL");
        }
    }
    public void maxOfThreeNumbersTest_1(){
        int firstNumber=7;
        int secondNumber=9;
        int thirdNumber=5;
        int expectedResult=9;
        Calculator calculator=new Calculator();
        int realResult=calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (realResult==expectedResult) {
            System.out.println("maxOfThreeNumbersTest_1=OK");
        }
        else {
            System.out.println("maxOfThreeNumbersTest_1=FAIL");
        }
    }
}


