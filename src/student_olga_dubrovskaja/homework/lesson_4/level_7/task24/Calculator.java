package student_olga_dubrovskaja.homework.lesson_4.level_7.task24;

//Дан класс Calculator и его тест CalculatorTest.
//Найдите способ упростить тесты в CalculatorTest.
//
//Тесты тоже должны быть написаны как можно лучше и качественнее!
//Дублирование кода - это почти всегда плохая идея в программировании.
//Поэтому от дублирования кода нужно избавляться.
//
//Подсказка: вынесите в отдельный метод проверку
//результата и замените её вызовом метода в каждом тесте.


class Calculator {
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
        return number % 2 == 0;
    }
}

