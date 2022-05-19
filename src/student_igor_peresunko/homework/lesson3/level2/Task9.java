package student_igor_peresunko.homework.lesson3.level2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.nextLine();
        String userName = "Igor";
        String greeting = "Hello " ;
        System.out.println(greeting + userName + "!");
    }
}
