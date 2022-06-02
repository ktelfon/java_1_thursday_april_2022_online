package student_Vladislavs_Solims.homework.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write too numbers :");
        int userNum1 = scanner.nextInt();
        int userNum2 = scanner.nextInt();
        if(userNum1<userNum2){
            System.out.println(userNum1 + " - lowest number");
        }else {
            System.out.println(userNum2 + " - lowest number");
        }
    }
}
