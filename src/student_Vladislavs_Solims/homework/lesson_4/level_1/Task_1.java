package student_Vladislavs_Solims.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number");
        int userNumber = scanner.nextInt();
        if (userNumber >= 0) {
            System.out.println("Pozitive");
        } else {
            System.out.println("Negative");
        }
    }
}

