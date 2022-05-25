package student_igor_peresunko.lesson_4.level2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int number2 = input2.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
