package student_toomas_park.lesson_11.homework.level_2;

public class DayOfTheWeekTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            System.out.println(new DayOfTheWeekDetectorSwitchVersion().detectDayName(i));
            System.out.println(new DayOfTheWeekDetectorIfVersion().detectDayName(i));
        }
    }
}
