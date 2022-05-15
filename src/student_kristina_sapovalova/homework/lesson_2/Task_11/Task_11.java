package student_kristina_sapovalova.homework.lesson_2.Task_11;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Please enter 1 of 3 numbers:");
        double userInput1 = scr.nextDouble();

        System.out.println("Please enter 2 of 3 numbers:");
        double userInput2 = scr.nextDouble();

        System.out.println("Please enter 3 of 3 numbers:");
        double userInput3 = scr.nextDouble();

        double result = (userInput1 + userInput2 + userInput3) / 3;


        System.out.println("Result of three: " + result);
    }
}


/* Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом. */
