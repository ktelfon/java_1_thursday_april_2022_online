package student_igor_peresunko.homework.lesson_5.level2;

import teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
public class Task13 {
    public static void main(String[] args) {
        int[] number = new int[3];
        Random random = new Random();
        int randomNumber1 = random.nextInt(10,1000);
        int randomNumber2 = random.nextInt(10,1000);
        int randomNumber3 = random.nextInt(10,1000);
        number[0] = randomNumber1;
        number[1] = randomNumber2;
        number[2] = randomNumber3;
        int sum = randomNumber1+randomNumber2+randomNumber3;
        System.out.println("sum of a random number - " + sum);
    }
}
