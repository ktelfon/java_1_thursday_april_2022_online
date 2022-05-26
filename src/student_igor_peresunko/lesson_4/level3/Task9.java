package student_igor_peresunko.lesson_4.level3;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task9 {
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

        if(number1<number2 && number2<number3){
            System.out.println("increasing");
        } else if (number1>number2 && number2>number3) {
            System.out.println("decreasing");
        }else {
            System.out.println("Neither increasing or decreasing order");}


    }
}
