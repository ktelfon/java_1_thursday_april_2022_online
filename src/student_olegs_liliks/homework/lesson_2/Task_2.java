package student_olegs_liliks.homework.lesson_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Formatting, same as task 1 ? ")
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first non-integer number");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Write second non-integer number");
        double secondDoubleNumber = scanner.nextDouble();
        double summa = firstDoubleNumber + secondDoubleNumber;
        double difference = firstDoubleNumber - secondDoubleNumber;
        double multiple = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;

        System.out.println(firstDoubleNumber + "+" + secondDoubleNumber + "=" + summa);
        System.out.println(firstDoubleNumber + "-" + secondDoubleNumber + "=" + difference);
        System.out.println(firstDoubleNumber + "*" + secondDoubleNumber + "=" + multiple);
        System.out.println(firstDoubleNumber + "/" + secondDoubleNumber + "=" + division);

    }
}
