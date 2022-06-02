package student_igor_peresunko.homework.lesson_5.level2;

import teacher.codereview.CodeReview;

import java.util.Random;
import java.util.Arrays;


@CodeReview(approved = true)
public class Task15 {
    public static void main(String[] args) {
        int[] number = new int[3];
        Random random = new Random();
        int randomNumber1 = random.nextInt(10,1000);
        int randomNumber2 = random.nextInt(10,1000);
        int randomNumber3 = random.nextInt(10,1000);
        number[0] = randomNumber1;
        number[1] = randomNumber2;
        number[2] = randomNumber3;
        System.out.println("Random value output - " + Arrays.toString(number));

        number[0] = randomNumber1 + 2;
        number[1] = randomNumber2 + 2;
        number[2] = randomNumber3 + 2;
        System.out.println("Random value output - " + Arrays.toString(number));
    }
}
