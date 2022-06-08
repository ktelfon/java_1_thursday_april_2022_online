package student_igor_peresunko.homework.lesson_6.level2;

public class DayOfTheWeekDetectorDemo {
    private static int firstNumber;

    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);


    }
}
