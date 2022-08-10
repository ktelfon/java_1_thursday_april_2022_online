package student_olegs_liliks.training_lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
    Scanner scr = new Scanner(System.in);
        System.out.println("Insert number from 1 to 7");
        int userNumber = scr.nextInt();
        if (userNumber == 1){
            System.out.println("It's Monday!");
        }
        if (userNumber == 2){
            System.out.println("It's Tuesday!");
        }
        if (userNumber == 3){
            System.out.println("It's Wednesday!");
        }
        if (userNumber == 4){
            System.out.println("It's Thursday!");
        }
        if (userNumber == 5){
            System.out.println("It's Friday!");
        }
        if (userNumber == 6){
            System.out.println("It's Saturday!");
        }
        if (userNumber == 7){
            System.out.println("It's Sunday!");
        }

}
}
