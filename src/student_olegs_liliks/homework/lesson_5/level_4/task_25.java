package student_olegs_liliks.homework.lesson_5.level_4;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Class name must start with a capital letter.")
public class task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write array length: ");
        int arrayLength = scanner.nextInt();
        int [] numbers = new int[arrayLength];
        for (int i = 0; i<arrayLength; i++){
        System.out.print("Write numbers : ");}
        int allNumbers = scanner.nextInt();
        System.out.println("Numbers are : " + Arrays.toString(numbers));

    }
}
