package student_olga_dubrovskaja.homework.lesson_4.level_4.task11_task15;
//Создайте класс Calculator. В этом классе создайте методы
//для сложения, вычитания, деления и умножения двух целых чисел.
//Подсказка:

//class Calculator {
//
//    public int sum(int firstNumber, int secondNumber) {
//        return firstNumber + secondNumber;
//    }
//
//    // реализуйте по аналогии оставшиеся методы
//
//}

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Calculator {


    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction (int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int multiplication (int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public int division (int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        boolean isEven;
        isEven = number % 2 == 0;
        return  isEven;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int maxOfTwoNumbers = firstNumber;
        if (firstNumber < secondNumber){
            maxOfTwoNumbers = secondNumber;
        }
        return maxOfTwoNumbers;
    }
    public int greaterNumber(int firstNumber, int secondNumber, int thirdNumber){
        int greaterNumber = firstNumber;
        if (secondNumber > firstNumber) {
            greaterNumber = secondNumber;
        } if (thirdNumber > greaterNumber){
            greaterNumber = thirdNumber;
        }
        return greaterNumber;
    }
}
