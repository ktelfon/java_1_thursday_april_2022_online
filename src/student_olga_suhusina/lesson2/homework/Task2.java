package student_olga_suhusina.lesson2.homework;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Hello! Enter two numbers:");
        Scanner scr = new Scanner(System.in);
        double firstDoubleNumber = scr.nextDouble();
        double secondDoubleNumber = scr.nextDouble();
        double sum = firstDoubleNumber + secondDoubleNumber;
        System.out.println("Sum: " + sum);
        double subtraction = firstDoubleNumber - secondDoubleNumber;
        System.out.println("Subtraction: " + subtraction);
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        System.out.println("Multiplication: " + multiplication);
        double division = firstDoubleNumber / secondDoubleNumber;
        System.out.println("Division: " + division);
        System.out.println("Super :)");
    }
}




