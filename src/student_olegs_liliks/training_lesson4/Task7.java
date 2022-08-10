package student_olegs_liliks.training_lesson4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Insert first number");
        int firstNumber = scr.nextInt();
        System.out.println("Insert second number");
        int secondNumber = scr.nextInt();
        if (firstNumber == secondNumber){
            System.out.println("Numbers are equals");
        }
        else{
            System.out.println("Numbers are different");

        }
    }
}

