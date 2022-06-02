package student_olegs_liliks.homework.lesson_5.level_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Class name must start with a capital letter.")
public class task_11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Write second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Write third number: ");
        int thirdNumber = scanner.nextInt();
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = thirdNumber;
        System.out.println("Numbers are : " + Arrays.toString(numbers));

    }
}