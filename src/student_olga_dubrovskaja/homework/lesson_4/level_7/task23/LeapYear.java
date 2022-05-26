package student_olga_dubrovskaja.homework.lesson_4.level_7.task23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYear {
    boolean leap;

    public boolean isLeap(int year) {
        if(year % 4 != 0){
            this.leap = false;
        } else if (year % 100 != 0) {
            this.leap = true;
        } else if (year % 400 == 0){
            this.leap = true;
        } else {
            this.leap = false;
        }
        return leap;
    }
}
