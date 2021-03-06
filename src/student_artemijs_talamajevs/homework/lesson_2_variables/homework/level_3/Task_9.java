package student_artemijs_talamajevs.homework.lesson_2_variables.homework.level_3;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Formatting")
public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer number ");
        int number;
        number = scanner.nextInt();
        int multiplication;
        for (int a = 1; a < 11; a++) {
            multiplication = number * a;
            System.out.println(number + "x" + a + "=" + multiplication);

        }
    }
    //Напишите программу, которая запрашивает у пользователя целое число
    //и печатает на консоль таблицу умножения для этого числа до 10.
    //
    //Test Data:
    //Input a number: 8
    //
    //Expected Output :
    //8 x 1 = 8
    //8 x 2 = 16
    //8 x 3 = 24
    //...
    //8 x 10 = 80

}
