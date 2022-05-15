package student_kristina_sapovalova.homework.lesson_2.Task_10;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle:");

        double userInputRadius = scr.nextDouble();

        double pwr2 = Math.pow(userInputRadius, 2);
        double PI = Math.PI;

        double circumference = 2 * PI * userInputRadius;
        double area = PI * pwr2;

        System.out.println("Your circle circumference is: " + circumference);
        System.out.println("Your circle area is: " + area);

    }
}

/* 7,Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 */
