package student_artemijs_talamajevs.lesson_4.level_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        System.out.println("Write number from 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextByte();
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday ");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Nothing here");
                break;

        }

    }
}
