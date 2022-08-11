package student_olegs_liliks.trenirovka.lesson_3.lesson_3.level_2;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task9 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Insert username");
        String userName = scr.next();
        System.out.println("Hello " +userName + " !");
    }

}
