package student_artemijs_talamajevs.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Write down any number,and lets see .It will be even or odd number :)");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();

        if((a%2)==0){
            System.out.println("Number " + a + " Even ");
        }
        else{
            if((a%1)==0){
                System.out.println("Number " + a + " odd ");
            }
        }
    }
}


