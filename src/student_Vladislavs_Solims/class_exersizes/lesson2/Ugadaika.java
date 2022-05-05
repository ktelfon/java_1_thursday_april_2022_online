package student_Vladislavs_Solims.class_exersizes.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Ugadaika {

        public static void main (String[]args) {
            System.out.println("Hi , guess a number 0-100 :)") ;
            Scanner scr = new Scanner(System.in) ;
            int num1 = scr.nextInt();
            Random random = new Random() ;
            int num2 = random.nextInt(0,100) ;
            boolean result = num1 == num2 ;
            System.out.println(result);
            System.out.println("correct answer was " + num2);
        }
}
