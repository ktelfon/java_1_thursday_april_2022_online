package student_olga_dubrovskaja.homework.lesson_2.level_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.println("Insert username: ");
        username = scanner.next();
        System.out.println("Hello, " + username);
    }
}


//    Написать консольную программу, которая запрашивает
//        имя пользователя и выводит на консоль текст:
//
//        Hello имя пользователя!
