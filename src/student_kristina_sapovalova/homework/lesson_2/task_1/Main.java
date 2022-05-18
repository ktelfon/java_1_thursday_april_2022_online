package student_kristina_sapovalova.homework.lesson_2.task_1;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Main {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter two integers:");

        int firstNumber = scr.nextInt();
        int secondNumber = scr.nextInt();

        int sum = firstNumber + secondNumber;
        int subtract = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + divide);
    }
}

//    Написать консольную программу, которая запрашивает у пользователя два целых числа и
//        выводит на консоль результаты: сложения, вычитания, умножения и деления.
//
//        1. Создать класс с нужным именем;
//        2. Создать описать main метод;
//        3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
//        Scanner scanner = new Scanner(System.in);
//        int firstNumber = scanner.nextInt();
//        4. Запишите полученные результаты в переменные;
//        5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
//        (каждый результат на новой строке отдельно).