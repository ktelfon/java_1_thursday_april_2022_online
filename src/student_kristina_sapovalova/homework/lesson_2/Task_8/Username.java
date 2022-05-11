package student_kristina_sapovalova.homework.lesson_2.Task_8;

import java.util.Scanner;

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
