package student_Vladislavs_Solims.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Write number :");
        int userNumber = scaner.nextInt();
        if (userNumber > 0) {
            System.out.println("Positive");
        } else if (userNumber < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Your number = 0");
        }
    }
}
