package student_igor_peresunko.classwork.lesson_4.level1;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }


    }

}
