package student_igor_peresunko.homework.lesson2.level_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hi , write two numbers too see the results :") ;
        Scanner scanner = new Scanner(System.in) ;
        int num1 = scanner.nextInt();
        System.out.println("And now second number)") ;
        int num2 = scanner.nextInt();
        int sum = num1+num2 ;
        int subtraction = num1-num2 ;
        int multiplication = num1*num2 ;
        int division = num1/num2 ;
        System.out.println(num1 + " + " + num2 + " = " +sum) ;
        System.out.println(num1 + "-" + num2 + "=" + subtraction) ;
        System.out.println(num1 + "*" + num2 + "=" + multiplication) ;
        System.out.println(num1 + "/" + num2 + "=" + division) ;
        System.out.println("Thanks for using my program !");}
}
