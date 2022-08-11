package student_igor_peresunko.homework.lesson_6.level1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Can be simplified")
public class Task6 {
    public boolean isEven(int number){
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


