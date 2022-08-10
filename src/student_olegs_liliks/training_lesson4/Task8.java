package student_olegs_liliks.training_lesson4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Write 1 number");
        int firstNumber = scr.nextInt();
        System.out.println("Write 2 number");
        int secondNumber = scr.nextInt();
        System.out.println("Write 3 number");
        int thirdNumber = scr.nextInt();
        if (firstNumber == secondNumber && firstNumber==thirdNumber) {
                System.out.println("Number are equals");
            } else if (firstNumber!=secondNumber || firstNumber!=thirdNumber || secondNumber!=thirdNumber ) {
            System.out.println("Neither all are equal or different");
        }
        else {
            System.out.println("All numbers different");
    }
    }
}
