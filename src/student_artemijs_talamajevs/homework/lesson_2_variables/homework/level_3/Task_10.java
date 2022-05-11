package student_artemijs_talamajevs.homework.lesson_2_variables.homework.level_3;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Circle radius");
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Circle area: " + area);
        double circumference = Math.PI * 2 * radius;
        System.out.println("Circle perimeter: " + circumference);
        //7,Напишите программу, которая запрашивает у пользователя
        //радиус круга (вещественное число) и печатает на консоль
        //периметр и площадь круга.
        //
        //Test Data:
        //Radius = 7.5
        //
        //Expected Output
        //Perimeter is = 47.12388980384689
        //Area is = 176.71458676442586
    }
}
