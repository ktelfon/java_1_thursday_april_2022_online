package student_olga_suhusina.lesson2.homework;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task1 {
    public static void main (String[] args){
        System.out.println("Hello! Enter two numbers:");
        Scanner scr = new Scanner(System.in);
        int firstNumber = scr.nextInt();
        int secondNumber = scr.nextInt();
        int sum = firstNumber+secondNumber;
        System.out.println("Sum: " + sum);
        int subtraction = firstNumber-secondNumber;
        System.out.println("Subtraction: " + subtraction);
        int multiplication = firstNumber*secondNumber;
        System.out.println("Multiplication: " + multiplication);
        int division = firstNumber/secondNumber;
        System.out.println("Division: " + division);
        System.out.println ("Super :)");




    }
}
