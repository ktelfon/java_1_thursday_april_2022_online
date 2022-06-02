package student_artemijs_talamajevs.lesson_4.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextByte();
        switch (a) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday ");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3 :
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Nothing here");
                break;

        }

    }
}
