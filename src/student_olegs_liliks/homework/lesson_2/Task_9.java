package student_olegs_liliks.homework.lesson_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Formatting")
public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int input;
        input = scanner.nextInt();
        int multiple;
        for (int x = 1; x < 11; x++) {
            multiple = input * x;
            System.out.println(input + "x" + x + "=" + multiple);
        }


    }
}
