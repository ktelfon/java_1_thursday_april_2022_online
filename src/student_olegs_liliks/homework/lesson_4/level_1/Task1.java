package student_olegs_liliks.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert a number : ");
        int number = scanner.nextInt();
        if (number>0) {
            System.out.println("Your number is positive");
        }
        else{
            System.out.println("Your number is negative");
        }
    }
}
