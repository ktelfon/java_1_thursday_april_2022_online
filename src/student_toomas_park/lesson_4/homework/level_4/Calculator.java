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
        return (firstNumber < secondNumber);
    }
    public boolean res2(int firstNumber, int secondNumber) {
        return (firstNumber > secondNumber);
    }
    public int res3(int number1, int number2, int number3) {
        if(number1 > number2){
            if(number1> number3) {
                return number1;
            }
            else {
                return number3;
            }
        } else if (number2 > number1) {
            if(number2 > number3) {
                return number2;
            }
            else {
                return number3;
            }
        }
        else {
            return number3;
        }
    }

    public boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
