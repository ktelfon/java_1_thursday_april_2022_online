package student_igor_peresunko.homework.lesson_5.level2;
import teacher.codereview.CodeReview;

import java.util.Scanner;
import java.util.Arrays;
@CodeReview(approved = true)
public class Task11 {
    public static void main(String[] args) {
        int[] number = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();
        number[0] = firstNumber;
        number[1] = secondNumber;
        number[2] = thirdNumber;
        System.out.println("Numbers are - " + Arrays.toString(number));
        }

    }

