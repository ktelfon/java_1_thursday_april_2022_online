package student_artemijs_talamajevs.lesson_4.level_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        if (a>b){
            System.out.println("Number " + a +" biggest number");
        }
        else {
            System.out.println("Number " + b + " biggest number");
        }
    }
}
