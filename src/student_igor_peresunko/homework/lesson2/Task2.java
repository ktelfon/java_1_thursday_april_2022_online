package student_igor_peresunko.homework.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Hi , write two numbers too see the results :") ;
        Scanner scanner = new Scanner(System.in) ;
        double num1 = scanner.nextDouble();
        System.out.println("And now write the second number ") ;
        double num2 = scanner.nextDouble();
        double sum = num1+num2 ;
        double subtraction = num1-num2 ;
        double multiplication = num1*num2 ;
        double division = num1/num2 ;
        System.out.println(num1 + " + " + num2 + " = " +sum) ;
        System.out.println(num1 + " - " + num2 + " = " +subtraction) ;
        System.out.println(num1 + " * " + num2 + " = " +multiplication) ;
        System.out.println(num1 + " / " + num2 + " = " +division) ;
        System.out.println("Thanks for using my program !") ;
    }
}
/*  Написать консольную программу, которая запрашивает у пользователя два вещественных числа
  //          (числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
   // Вещественные числа можно запрашивать с консоли используя обьект Scanner
   // следующим образом:  */


