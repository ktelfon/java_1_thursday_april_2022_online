package student_olegs_liliks.training_lesson4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Insert first number : ");
        int numberOne = scr.nextInt();
        System.out.print("Insert second number: ");
        int numberTwo = scr.nextInt();
        System.out.print("Insert third number: ");
        int numberThree = scr.nextInt();
        if (numberOne>numberTwo && numberTwo>
                numberThree){
            System.out.println("Decrease");
        } else if (numberThree>numberTwo && numberTwo>numberOne) {
            System.out.println("Increase");

        }
        else {
            System.out.println("HZ");
        }
    }
}
