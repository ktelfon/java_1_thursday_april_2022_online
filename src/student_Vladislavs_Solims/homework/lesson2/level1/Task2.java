package student_Vladislavs_Solims.homework.lesson2.level1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Hi , write two numbers too see the results :") ;
        Scanner scanner = new Scanner(System.in) ;
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result1 = num1+num2 ;
        double result2 = num1-num2 ;
        double result3 = num1*num2 ;
        double result4 = num1/num2 ;
        System.out.println(result1) ;
        System.out.println(result2) ;
        System.out.println(result3) ;
        System.out.println(result4) ;
    }
}
