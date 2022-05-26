package student_artemijs_talamajevs.lesson_4.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println("Write 2 number and lets see it ,this 2 number together are equals or different ");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        if (a==b){
            System.out.println("this 2 number are equals");
        }
        else{
            System.out.println("this 2 number are different");
        }
    }
}
