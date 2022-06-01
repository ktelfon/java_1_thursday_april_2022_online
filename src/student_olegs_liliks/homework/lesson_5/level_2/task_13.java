package student_olegs_liliks.homework.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

public class task_13 {
        public static void main(String[] args) {
            int[] numbers = new int[3];
            Random random = new Random();
            int randomNumber1 = random.nextInt(10, 100);
            int randomNumber2 = random.nextInt(10, 100);
            int randomNumber3 = random.nextInt(10, 100);
            numbers[0] = randomNumber1;
            numbers[1] = randomNumber2;
            numbers[2] = randomNumber3;
            int sum = randomNumber1+randomNumber2+randomNumber3;
            System.out.println("Sum of random numbers are: " +sum);
        }
    }

