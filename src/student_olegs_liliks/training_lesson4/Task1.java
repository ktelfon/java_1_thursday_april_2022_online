package student_olegs_liliks.training_lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Insert your number");
        int userNumber = scr.nextInt();
        if (userNumber > 0) {
            System.out.println("Your number is positive");
        } else if (userNumber == 0) {
            System.out.println("Your number is 0");

        } else {
            System.out.println("Your number is negative");
        }
    }
}
