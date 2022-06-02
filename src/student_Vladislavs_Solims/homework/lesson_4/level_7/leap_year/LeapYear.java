package student_Vladislavs_Solims.homework.lesson_4.level_7.leap_year;

public class LeapYear {

    String checkLeap(int number) {
        if ((number % 400 == 0) && (number % 100 == 0)) {
            return "Leap century";
        } else if (number % 100 == 0) {
            return "century";
        } else if (number % 4 == 0) {
            return "Leap year";
        } else {
            return "Symple year";
        }
    }


}
