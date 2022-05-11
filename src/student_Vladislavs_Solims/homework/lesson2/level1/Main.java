package student_Vladislavs_Solims.homework.lesson2.level1;
/*Написать консольную программу, которая запрашивает у пользователя два целых числа и
        выводит на консоль результаты: сложения, вычитания, умножения и деления.

        1. Создать класс с нужным именем;
        2. Создать описать main метод;
        3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        4. Запишите полученные результаты в переменные;
        5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
        (каждый результат на новой строке отдельно). */

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Main {
    public static void main(String[] args) {
        // task1
        System.out.println("Hi , write two numbers too see the results :");

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("And now second number)");

        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + "-" + num2 + "=" + subtraction);
        System.out.println(num1 + "*" + num2 + "=" + multiplication);
        System.out.println(num1 + "/" + num2 + "=" + division);
        System.out.println("Thanks for using my program !");
    }
}
