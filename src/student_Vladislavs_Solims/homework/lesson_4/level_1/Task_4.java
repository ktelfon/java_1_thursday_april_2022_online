package student_Vladislavs_Solims.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number too see odd or even :");
        int userNum = scanner.nextInt();
        int result = userNum % 2;
        if (result == 0) {
            System.out.println("Even number !");
        } else {
            System.out.println("Odd number !");
        }
    }

}
