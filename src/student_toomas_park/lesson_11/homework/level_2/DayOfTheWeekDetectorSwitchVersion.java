package student_toomas_park.lesson_11.homework.level_2;

public class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        switch (number) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
        }
        return "Please input a valid number between 1 and 7";
    }
}
