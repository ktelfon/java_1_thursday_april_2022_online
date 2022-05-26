package student_olegs_liliks.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert a number : ");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Your number is even");}
        else{
            System.out.println("Your number is odd");}
    }
}
