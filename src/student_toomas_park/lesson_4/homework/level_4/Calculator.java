package student_toomas_park.lesson_4.homework.level_4;

public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public boolean res1(int firstNumber, int secondNumber) {
        return (firstNumber < secondNumber == true);
    }
    public boolean res2(int firstNumber, int secondNumber) {
        return (firstNumber > secondNumber == true);
    }

    public boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
