package student_olegs_liliks.training_lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Insert number please");
       int userNumber =  scr.nextInt();
       if (userNumber % 2 == 0){
           System.out.println("CHislo chjotnoe");

       }
       else {
           System.out.println("Nechjotnoe ");
       }

    }
}
