package student_olegs_liliks.homework.lesson_5.level_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Class name must start with a capital letter.")
public class task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        int randomNumber1 = random.nextInt(10, 100);
        int randomNumber2 = random.nextInt(10, 100);
        int randomNumber3 = random.nextInt(10, 100);
        numbers[0] = randomNumber1;
        numbers[1] = randomNumber2;
        numbers[2] = randomNumber3;
        System.out.println("Random numbers are: " + Arrays.toString(numbers));

        numbers[0] = randomNumber1 +2;
        numbers[1] = randomNumber2 +2;
        numbers[2] = randomNumber3 +2;
        System.out.println("Random numbers are: " + Arrays.toString(numbers));
    }
}

