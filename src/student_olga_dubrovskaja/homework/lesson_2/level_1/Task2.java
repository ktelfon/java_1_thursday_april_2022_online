package student_olga_dubrovskaja.homework.lesson_2.level_1;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number here:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Insert second number here:");
        double secondNumber = scanner.nextDouble();
        double sumResult = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sumResult);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);
    }
}


//Написать консольную программу, которая запрашивает у пользователя два вещественных числа
//(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
//Вещественные числа можно запрашивать с консоли используя обьект Scanner
//следующим образом:
//
//    Scanner scanner = new Scanner(System.in);
//    double firstDoubleNumber = scanner.nextDouble();