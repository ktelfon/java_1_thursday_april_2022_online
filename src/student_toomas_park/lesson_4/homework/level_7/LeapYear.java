package student_toomas_park.lesson_4.homework.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class LeapYear {
    boolean high;

    public boolean detect(int year) {
        if (year % 4 != 0) {
            high = true;
        } else if (year % 100 != 0) {
            high = true;
        } else if (year % 400 == 0) {
            high = true;
        } else {
            high = false;
        }
        return high;
    }
}

