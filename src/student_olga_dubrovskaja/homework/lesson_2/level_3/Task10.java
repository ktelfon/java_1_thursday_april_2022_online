package student_olga_dubrovskaja.homework.lesson_2.level_3;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius;
        System.out.println("Insert radius: ");
        radius = scanner.nextDouble();

        double perimeter;
        double area;
        double pi = Math.PI;
        perimeter = 2 * pi * radius;
        area = pi * radius * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);


    }
}


//      7. Напишите программу, которая запрашивает у пользователя
//      радиус круга (вещественное число) и печатает на консоль
//      периметр и площадь круга.
//
//      Test Data:
//      Radius = 7.5
//      Expected Output
//    Perimeter is = 47.12388980384689
//  Area is = 176.71458676442586