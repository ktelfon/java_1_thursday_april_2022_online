package student_olegs_liliks.homework.lesson_4.level_4;

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
    public boolean isEven(int number) {
        boolean isEven;
        return isEven= number % 2 ==0;
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int maxOfTwoNumbers = firstNumber;
        if (firstNumber<secondNumber){
        maxOfTwoNumbers = secondNumber;}
        return maxOfTwoNumbers;
    }
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int maxOfThreeNumbers = firstNumber;
        if (firstNumber<secondNumber){
            maxOfThreeNumbers = secondNumber;}
        if (thirdNumber>maxOfThreeNumbers){
            maxOfThreeNumbers=thirdNumber;}
        return maxOfThreeNumbers;
    }

    }


