package student_toomas_park.lesson_4.homework.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.testn1(2021);
        test.testn2(2024);
        test.testn3(2001);
        test.testn4(1630);
    }
    public void testn1(int number){
        boolean expectedResult = false;
        LeapYear leapYear = new LeapYear();
        tResult(expectedResult == leapYear.detect(number), "2021 (false) ");
    }
    public void testn2(int number){
        boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        tResult(expectedResult == leapYear.detect(number), "2024 (true) ");
    }
    public void testn3(int number){
        boolean expectedResult = false;
        LeapYear leapYear = new LeapYear();
        tResult(expectedResult == leapYear.detect(number), "2001 (false) ");
    }
    public void testn4(int number){
        boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        tResult(expectedResult == leapYear.detect(number), "1630 (true) ");
    }

    public void tResult(boolean result, String test) {
        if (result) {
            System.out.println(test + "True");
        } else {
            System.out.println(test + "False");
        }
    }
}
