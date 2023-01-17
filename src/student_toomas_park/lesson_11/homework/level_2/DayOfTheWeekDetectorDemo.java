package student_toomas_park.lesson_11.homework.level_2;

import java.io.IOException;
import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println(new DayOfTheWeekDetectorSwitchVersion().detectDayName(input.nextInt()));
    }
}
