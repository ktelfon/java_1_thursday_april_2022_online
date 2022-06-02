package student_olegs_liliks.homework.lesson_5.level_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Class name must start with a capital letter.")
public class task_10 {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        numbers[0] = 5;
        numbers[1] = 7;
        numbers[2] = 9;
        System.out.println("Numbers are : " + Arrays.toString(numbers));

    }
}
