package student_artemijs_talamajevs.homework.lesson_2_variables.homework.level_2;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username;
        System.out.println("Write your username");
        username=scanner.next();
        System.out.println("Hello"+ username);

//Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//
//Hello имя пользователя!
    }
}
