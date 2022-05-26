package student_Vladislavs_Solims.homework.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write 3 numbers");
        int userNum1 = scanner.nextInt();
        int userNum2 = scanner.nextInt();
        int userNum3 = scanner.nextInt();

        if(userNum1>userNum2 && userNum3<userNum2) {
            System.out.println(userNum1);
        } else if (userNum2>userNum1 && userNum3<userNum1) {
            System.out.println(userNum2);
        }else {
            System.out.println(userNum3);
        }


    }


}
