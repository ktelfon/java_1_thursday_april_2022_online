package student_artemijs_talamajevs.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println("Write a program that accepts three numbers from the user and prints:");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if (a>b & b > c) {

            System.out.println(a + " " + b + " " + c);
        }

        else if (a<b & b<c)  {

            System.out.println(a + " " + b + " " +c);
        }

        else {

            System.out.println("Otherwise");

    }
}
}
