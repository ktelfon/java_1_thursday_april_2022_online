package student_igor_peresunko.classwork.lesson_4.level3;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task10 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int number2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the third number ");
        int number3 = input3.nextInt();

        int greaterNumber = number1;

        if (number2 > number3) {
            greaterNumber = number2;
        }

        if (number3 > greaterNumber) {
            greaterNumber = number3;
        }

        System.out.println(greaterNumber);


    }
}
