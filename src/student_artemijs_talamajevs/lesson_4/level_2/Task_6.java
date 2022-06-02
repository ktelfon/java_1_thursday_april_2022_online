package student_artemijs_talamajevs.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("Write 2 random nubmer,and lets see witch one is the smallest ");
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if (a<b){
            System.out.println("Number " + a + " smallest number" );
        }
        else {
            System.out.println("Number " + b + " smallest number");
        }
        }
    }

