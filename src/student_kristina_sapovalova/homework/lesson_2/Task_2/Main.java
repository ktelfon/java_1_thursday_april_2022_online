package student_kristina_sapovalova.homework.lesson_2.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter two decimal numbers:");

        double firstDecimalNumber = scr.nextDouble();
        double secondDecimalNumber = scr.nextDouble();

        double sum = firstDecimalNumber + secondDecimalNumber;
        double subtract = firstDecimalNumber - secondDecimalNumber;
        double multiply = firstDecimalNumber * secondDecimalNumber;
        double divide = firstDecimalNumber / secondDecimalNumber;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + divide);

    }
}


//    Написать консольную программу, которая запрашивает у пользователя два вещественных числа
//        (числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
//        Вещественные числа можно запрашивать с консоли используя обьект Scanner
//        следующим образом:
//
//        Scanner scanner = new Scanner(System.in);
//        double firstDoubleNumber = scanner.nextDouble();