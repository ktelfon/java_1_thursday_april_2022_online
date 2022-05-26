package student_toomas_park.lesson_4.homework.level_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "don't forget {} when writing if")
public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число : ");
        int number = input.nextInt();
        if (number == 0)
            System.out.println("Введенное число является нулем");
        else if (number < 0)
            System.out.println("Введенное число является отрицательным");
        else
            System.out.println("Введенное число является положительным");
    }
}
