package student_igor_peresunko.homework.lesson2.level2;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task7 {
    public static void main(String[] args){
        System.out.println("You can login!");

        Scanner scr = new Scanner(System.in);
        String login = scr.next();
        System.out.println("Hello" + login);
    }



}
