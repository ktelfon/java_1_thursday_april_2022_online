package teacher.lesson_11_interfaces.lessoncode.homework.level2.task5;

import teacher.lesson_11_interfaces.lessoncode.homework.level2.task4.DayOfTheWeekDetector;
import teacher.lesson_11_interfaces.lessoncode.homework.level2.task4.DayOfTheWeekDetectorSwitchVersion;

public class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo detectorDemo = new DayOfTheWeekDetectorDemo(
                new DayOfTheWeekDetectorSwitchVersion());
    }
}
