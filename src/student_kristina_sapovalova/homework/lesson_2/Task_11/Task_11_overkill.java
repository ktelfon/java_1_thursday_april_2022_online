package student_kristina_sapovalova.homework.lesson_2.Task_11;

import java.util.Scanner;

/* Для такой задачи наверное слишком сложное решение, но попробовала сделать таким путем */

public class Task_11_overkill {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Please enter 1 of 3 numbers:");
        double userInput1 = scr.nextDouble();

        System.out.println("Please enter 2 of 3 numbers:");
        double userInput2 = scr.nextDouble();

        System.out.println("Please enter 3 of 3 numbers:");
        double userInput3 = scr.nextDouble();

        double[] allNumbers = {userInput1, userInput2, userInput3};

        double sum = 0;


        for (int i = 0; i < allNumbers.length; i++) {

            sum = sum + allNumbers[i];


        }

        double result = sum / allNumbers.length;

        System.out.println(result);
    }
}
