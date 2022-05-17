package student_kristina_sapovalova.homework.lesson_2.task_8;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Username {
    public static void main(String[] args) {

        System.out.println("Please enter your username:");

        Scanner userInput = new Scanner(System.in);
        String username = userInput.next();

        System.out.println("Hello " + username + "!");

    }
}

//    Написать консольную программу, которая запрашивает
//        имя пользователя и выводит на консоль текст:
//
//        Hello имя пользователя!
