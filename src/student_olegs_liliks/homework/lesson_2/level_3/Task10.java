package student_olegs_liliks.homework.lesson_2.level_3;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Formatting")
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert circle radius");
        double radius = scanner.nextDouble();

        double circumference = Math.PI * 2 * radius;
        System.out.println("Perimeter is " + circumference);
        double area = Math.PI * radius * radius;
        System.out.println("Area is " + area);

    }
}
