package student_toomas_park.lesson_4.homework.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
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
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 7;  // подготавливаем тестовые данные
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("sub test = OK");
        } else {
            System.out.println("sub test = FAIL");
        }
    }
    public void mulTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 2;  // подготавливаем тестовые данные
        int expectedResult = 20;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("mul test = OK");
        } else {
            System.out.println("mul test = FAIL");
        }
    }
    public void divTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("div test = OK");
        } else {
            System.out.println("div test = FAIL");
        }
    }

}