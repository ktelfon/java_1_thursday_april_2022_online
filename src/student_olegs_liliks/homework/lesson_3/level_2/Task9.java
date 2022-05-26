package student_olegs_liliks.homework.lesson_3.level_2;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your username:");
        String userName = scanner.next();
        System.out.println("Hello " + userName);

    }
}
