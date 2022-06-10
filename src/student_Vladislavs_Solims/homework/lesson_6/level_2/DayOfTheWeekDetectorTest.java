package student_Vladislavs_Solims.homework.lesson_6.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.detectDayCheck(5);

    }

    void detectDayCheck (int number){
        DayOfTheWeekDetectorUtil dayOfTheWeekDetectorUtil = new DayOfTheWeekDetectorUtil();
        checkResults(dayOfTheWeekDetectorUtil.getDetectDay(number).equals("Friday"), "Detect Day Test");
    }

    void checkResults(boolean condition , String testName){
        if (condition) {
            System.out.println(testName + " - OK");
        }else {
            System.out.println(testName + " - FALSE");
        }
        }
}
