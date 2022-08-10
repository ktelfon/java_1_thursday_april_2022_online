package student_olegs_liliks.training_lesson4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Insert first number");
        int firstNumber = scr.nextInt();
        System.out.println("Insert second number");
        int secondNumber = scr.nextInt();
        if (firstNumber>secondNumber){
            System.out.println("Biggest number is "+firstNumber);
        }
        else{
            System.out.println("Biggest number is "+secondNumber);

        }
    }
}
