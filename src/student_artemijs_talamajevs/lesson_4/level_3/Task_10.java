package student_artemijs_talamajevs.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Write 3 different number,and lets see wich one is the biggest");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if (b>c & b<a){
            System.out.println("First number are biggest");
        } else if (c>b & b<a) {
            System.out.println("Second number are biggest");
        } else {
            System.out.println("Third number are biggest");
        }

    }
}
