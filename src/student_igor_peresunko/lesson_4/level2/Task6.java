package student_igor_peresunko.lesson_4.level2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int number2 = input2.nextInt();

        if (number1 < number2) {
            System.out.println(number1);
        } else if (number1 == number2) {
            System.out.println("These numbers are equal to each other");
        } else {
            System.out.println(number2);
        }
    }
}
