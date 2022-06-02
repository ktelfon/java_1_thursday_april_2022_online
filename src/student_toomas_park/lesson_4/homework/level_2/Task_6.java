package student_toomas_park.lesson_4.homework.level_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "don't forget {} when writing if")
public class Task_6 {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите первое целое число : ");
        int number1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Введите второе целое число : ");
        int number2 = input2.nextInt();
        if (number1 < number2)
            System.out.println(number1);
        else
            System.out.println(number2);
    }
}
