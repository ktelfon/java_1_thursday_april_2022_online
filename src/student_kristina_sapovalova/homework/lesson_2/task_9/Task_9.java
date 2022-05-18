package student_kristina_sapovalova.homework.lesson_2.task_9;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter integer:");

        int userInput = scr.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(userInput + " x " + i + " = " + i * userInput);
        }

    }
}

//    Напишите программу, которая запрашивает у пользователя целое число
//        и печатает на консоль таблицу умножения для этого числа до 10.
//
//        Test Data:
//        Input a number: 8
//
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80
