package student_olegs_liliks.homework.lesson_2.level_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Formatting")
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Write second number");
        int secondNumber = scanner.nextInt();
        int summa = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int multiple = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println(firstNumber + "+" + secondNumber + "=" + summa);
        System.out.println(firstNumber + "-" + secondNumber + "=" + difference);
        System.out.println(firstNumber + "*" + secondNumber + "=" + multiple);
        System.out.println(firstNumber + "/" + secondNumber + "=" + division);
    }
}
