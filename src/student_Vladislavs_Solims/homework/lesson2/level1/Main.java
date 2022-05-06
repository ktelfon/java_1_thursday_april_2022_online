package student_Vladislavs_Solims.homework.lesson2.level1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // task1
        System.out.println("Hi , write two numbers too see the results :") ;
        Scanner scanner = new Scanner(System.in) ;
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result1 = num1+num2 ;
        int result2 = num1-num2 ;
        int result3 = num1*num2 ;
        int result4 = num1/num2 ;
        System.out.println(result1) ;
        System.out.println(result2) ;
        System.out.println(result3) ;
        System.out.println(result4) ;

    }
}
