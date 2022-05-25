package student_olga_dubrovskaja.homework.lesson_4.level_4.task11_task15;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.evenNumberTest();
        calculatorTest.oddNumberTest();
        calculatorTest.greaterNumberFirstIsMax();
        calculatorTest.greaterNumberSecondIsMax();
        calculatorTest.greaterNumberThirdIsMax();
        calculatorTest.greaterNumberFirstAndSecondAreMax();
        calculatorTest.greaterNumberSecondAndThirdAreMax();
        calculatorTest.greterNumberAllEven();
        calculatorTest.maxOfTwoNumbersFirstIsMax();
        calculatorTest.maxOfTwoNumbersSecondIsMax();
        calculatorTest.maxOfTwoNumbersBothAreEven();
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

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }
    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void evenNumberTest(){
        int number = 2;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if(realResult == expectedResult){
            System.out.println("isEven test with even number = OK");
        } else {
            System.out.println("isEven test with even number = FAIL");
        }
    }
    public void oddNumberTest(){
        int number = 3;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if(realResult == expectedResult){
            System.out.println("isEven test with odd number = OK");
        } else {
            System.out.println("isEven test with odd number = FAIL");
        }
    }

    public void maxOfTwoNumbersFirstIsMax(){
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("maxOfTwoNumbers test with first number being greater = OK");
        } else {
            System.out.println("maxOfTwoNumbers test with first number being greater = FAIL");
        }
    }

    public void maxOfTwoNumbersSecondIsMax(){
        int firstNumber = 2;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("maxOfTwoNumbers test with second number being greater = OK");
        } else {
            System.out.println("maxOfTwoNumbers test with second number being greater = FAIL");
        }
    }

    public void maxOfTwoNumbersBothAreEven(){
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("maxOfTwoNumbers test with both numbers even = OK");
        } else {
            System.out.println("maxOfTwoNumbers test with both numbers even = FAIL");
        }
    }

    public void greaterNumberFirstIsMax() {
        int firstNumber = 10;
        int secondNumber = 3;
        int thirdNumber = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.greaterNumber(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectedResult) {
            System.out.println("greaterNumber test with first number being greater = OK");
        } else {
            System.out.println("greaterNumber test with first number being greater = FAILED");
        }
    }

    public void greaterNumberSecondIsMax() {
        int firstNumber = 3;
        int secondNumber = 10;
        int thirdNumber = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.greaterNumber(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectedResult) {
            System.out.println("greaterNumber test with second number being greater = OK");
        } else {
            System.out.println("greaterNumber test with second number being greater = FAILED");
        }
    }

    public void greaterNumberThirdIsMax() {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.greaterNumber(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectedResult) {
            System.out.println("greaterNumber test with third number being greater = OK");
        } else {
            System.out.println("greaterNumber test with third number being greater = FAILED");
        }
    }
    public void greaterNumberFirstAndSecondAreMax() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.greaterNumber(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectedResult) {
            System.out.println("greaterNumber test with first and second numbers being greater = OK");
        } else {
            System.out.println("greaterNumber test with first and second numbers being greater = FAILED");
        }
    }
    public void greaterNumberSecondAndThirdAreMax() {
        int firstNumber = 3;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.greaterNumber(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectedResult) {
            System.out.println("greaterNumber test with second and third numbers being greater = OK");
        } else {
            System.out.println("greaterNumber test with second and third numbers being greater = FAILED");
        }
    }
    public void greterNumberAllEven() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.greaterNumber(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectedResult) {
            System.out.println("greaterNumber test with all numbers equal = OK");
        } else {
            System.out.println("greaterNumber test with all numbers equal = FAILED");
        }
    }
}