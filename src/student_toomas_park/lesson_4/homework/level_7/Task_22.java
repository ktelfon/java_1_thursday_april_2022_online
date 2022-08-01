package student_toomas_park.lesson_4.homework.level_7;

import java.util.Scanner;

public class Task_22 {
    public String main(int number) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        if (number1 / 3 != 0) {
            if (number1 / 5 != 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println("Fizz");
            }
        } else if (number1 / 5 != 0) {
            if (number / 3 != 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println("Buzz");
            }
        } else {
            System.out.println("" + number1);
        }
        return "";
    }
}
