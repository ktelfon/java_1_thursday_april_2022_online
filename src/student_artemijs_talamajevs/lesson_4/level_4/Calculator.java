package student_artemijs_talamajevs.lesson_4.level_4;

public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multi(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        return (number % 2) == 0;

    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }
    public  int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                return firstNumber;
            } else {
                return thirdNumber;
            }
        } else if (secondNumber > firstNumber) {
            if (secondNumber > thirdNumber) {
                return secondNumber;
            } else {
                return thirdNumber;
            }
        } else {
            return thirdNumber;
        }
    }
    }
    


    //Добавьте в класс Calculator метод для определения
//максимального из трёх целых чисел.
//
//Добавьте в класс CalculatorTest тесты для этого метода.
//Тесты должны покрывать следующие тестовые сценарии:
//- первое число больше второго и третьего
//- второе число больше первого и третьего
//- третье число больше первого и второго
//- первые два равны и больше третьего
//- ...
//- три числа равны
//По одному тесту на каждый из сценариев!

