package student_toomas_park.lesson_4.homework.level_7;

import java.util.Scanner;

public class FizzBuzz {
    public String detect(int number) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        if (number1 / 3 != 0) {
            if (number1 / 5 != 0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (number1 / 5 != 0) {
            if (number / 3 != 0) {
                return "FizzBuzz";
            } else {
                return "Buzz";
            }
        } else {
            System.out.println("" + number1);
        }
        return "";
    }
}
