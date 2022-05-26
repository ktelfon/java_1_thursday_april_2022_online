package student_Vladislavs_Solims.homework.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 3 numbers");
        int userNum1 = scanner.nextInt();
        int userNum2 = scanner.nextInt();
        int userNum3 = scanner.nextInt();

        if(userNum1<userNum2 && userNum2<userNum3) {
            System.out.println("increasing");
        } else if (userNum1>userNum2 && userNum2>userNum3) {
            System.out.println("decreasing");
        }else {
            System.out.println("Neither increasing or decreasing order");
        }


    }



}


