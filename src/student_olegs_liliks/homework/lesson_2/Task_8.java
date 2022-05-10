package student_olegs_liliks.homework.lesson_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Formatting")
public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.println("Write your username");
        username = scanner.next();
        System.out.println("Hello " + username + "!");

    }
}
