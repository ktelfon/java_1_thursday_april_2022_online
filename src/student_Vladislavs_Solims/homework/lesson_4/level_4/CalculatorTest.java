package student_Vladislavs_Solims.homework.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.TestSum();
        calculatorTest.TestSubstraction();
        calculatorTest.TestMultiplication();
        calculatorTest.TestDevision();
        calculatorTest.TestEvenNum();
        calculatorTest.TestMinNum();
        calculatorTest.TestMaxNum();
        calculatorTest.TestEquals();
    }

    public void TestSum() {
        int firstNum = 5;
        int secondNum = 3;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNum, secondNum);
        if (realResult == expectedResult) {
            System.out.println("SumTest Passed !");
        } else {
            System.out.println("SumTest Failed !");
        }
    }

    public void TestSubstraction() {
        int firstNum = 5;
        int secondNum = 3;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNum, secondNum);
        if (realResult == expectedResult) {
            System.out.println("TestSubstraction Passed !");
        } else {
            System.out.println("TestSubstraction Failed !");
        }
    }

    public void TestMultiplication() {
        int firstNum = 5;
        int secondNum = 3;
        int expectedNum = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNum, secondNum);
        if (realResult == expectedNum) {
            System.out.println("TestMultiplication Passed!");
        } else {
            System.out.println("TestMultiplication Failed !");
        }
    }

    public void TestDevision() {
        int firstNum = 6;
        int secondNum = 3;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realresult = calculator.devision(firstNum, secondNum);
        if (realresult == expectedResult) {
            System.out.println("TestDevision Passed !");
        } else {
            System.out.println("TestDevision Failed !");
        }
    }

    public void TestEvenNum() {
        int num = 4;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(num);
        if (realResult == expectedResult) {
            System.out.println("TestEvenNum Passed !");
        } else {
            System.out.println("TestEvenNum Failed !");
        }
    }

    public void TestMaxNum() {
        int num1 = 1;
        int num2 = 2;
        int expectedNum = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNum(num1, num2);
        if (realResult == expectedNum) {
            System.out.println("TestMaxNum Passed !");
        } else {
            System.out.println("TestMaxNum Failed !");
        }
    }

    public void TestMinNum() {
        int num1 = 1;
        int num2 = 2;
        int expectednum = 1;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNum(num1, num2);
        if (realResult == expectednum) {
            System.out.println("TestMinNum Passed !");
        } else {
            System.out.println("TestMinNum Failed !");
        }
    }

    public void TestEquals() {
        int num1 = 2;
        int num2 = 2;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.equalNum(num1, num2);
        if (expectedResult == realResult) {
            System.out.println("TestEquals Passed !");
        } else {
            System.out.println("TestEquals Failed !");
        }
    }

    public void TestMaxOfThreeNum() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTrhreeNum(num1, num2, num3);

    }


}