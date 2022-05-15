package student_olga_dubrovskaja.homework.lesson_2.level_3;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int input;
        input = scanner.nextInt();
        int x;
        int multiplication;
        for(x = 1; x<11; x++){
            multiplication = input * x;
            System.out.println(input + " x " + x + " = " + multiplication);
        }

    }
}



//    Напишите программу, которая запрашивает у пользователя целое число
//        и печатает на консоль таблицу умножения для этого числа до 10.
//
//        Test Data:
//        Input a number: 8
//
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80