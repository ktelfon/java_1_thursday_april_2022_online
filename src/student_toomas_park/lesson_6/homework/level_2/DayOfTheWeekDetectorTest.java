package student_toomas_park.lesson_6.homework.level_2;


import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorTest {
    public void testMonday() {
        DayOfTheWeekDetector testWeek = new DayOfTheWeekDetector();
        int dayNumber = 1;
        String testResult = testWeek.findDayOfTheWeek(dayNumber);
        System.out.print("Monday test:");
        compareResult("Monday", testResult);
    }

    public void testTuesday() {
        DayOfTheWeekDetector testWeek = new DayOfTheWeekDetector();
        int dayNumber = 2;
        String testResult = testWeek.findDayOfTheWeek(dayNumber);
        System.out.print("Tuesday test:");
        compareResult("Tuesday", testResult);
    }

    public void testWednesday() {
        DayOfTheWeekDetector testWeek = new DayOfTheWeekDetector();
        int dayNumber = 3;
        String testResult = testWeek.findDayOfTheWeek(dayNumber);
        System.out.print("Wednesday test:");
        compareResult("Wednesday", testResult);
    }

    public void testThursday() {
        DayOfTheWeekDetector testWeek = new DayOfTheWeekDetector();
        int dayNumber = 4;
        String testResult = testWeek.findDayOfTheWeek(dayNumber);
        System.out.print("Thursday test:");
        compareResult("Thursday", testResult);
    }

    public void testFriday() {
        DayOfTheWeekDetector testWeek = new DayOfTheWeekDetector();
        int dayNumber = 5;
        String testResult = testWeek.findDayOfTheWeek(dayNumber);
        System.out.print("Friday test:");
        compareResult("Friday", testResult);
    }

    public void testSaturday() {
       DayOfTheWeekDetector testWeek = new DayOfTheWeekDetector();
        int dayNumber = 6;
        String testResult = testWeek.findDayOfTheWeek(dayNumber);
        System.out.print("Saturday test:");
        compareResult("Saturday", testResult);
    }

    public void testSunday() {
        DayOfTheWeekDetector testWeek = new DayOfTheWeekDetector();
        int dayNumber = 7;
        String testResult = testWeek.findDayOfTheWeek(dayNumber);
        System.out.print("Sunday test:");
        compareResult("Sunday", testResult);
    }

    public void testWrongDay() {
        DayOfTheWeekDetector testWeek = new DayOfTheWeekDetector();
        int dayNumber = 8;
        String testResult = testWeek.findDayOfTheWeek(dayNumber);
        System.out.print("Wrong day test:");
        compareResult("Not correct day number", testResult);
    }

    public void compareResult(String expected, String test) {
        if (expected.equals(test)) {
            System.out.println(" True ");
        } else {
            System.out.println(" False");
        }
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.testMonday();
        test.testTuesday();
        test.testWednesday();
        test.testThursday();
        test.testFriday();
        test.testSaturday();
        test.testSunday();
        test.testWrongDay();

    }
}
