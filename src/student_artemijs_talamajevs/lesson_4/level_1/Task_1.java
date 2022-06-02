package student_artemijs_talamajevs.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a<0){
            System.out.println("It will be negative");
        } else if (a>0) {
            System.out.println("It will be positive");
            
        }
        else{
            System.out.println("it will be nothing");
        }

    }
}
