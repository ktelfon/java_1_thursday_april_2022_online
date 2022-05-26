package student_toomas_park.lesson_4.homework.level_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "don't forget {} when writing if")
public class Task_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число : ");
        int number = input.nextInt();
        if (number % 2 == 0)
            System.out.println("Введенное число является четным");
        else
            System.out.println("Введенное число является нечетным");
    }
}
