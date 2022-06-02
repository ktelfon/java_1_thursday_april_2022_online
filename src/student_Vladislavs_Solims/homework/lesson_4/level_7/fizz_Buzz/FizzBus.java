package student_Vladislavs_Solims.homework.lesson_4.level_7.fizz_Buzz;

public class FizzBus {
    String detect(int number) {
        if ((number % 5 == 0) && (number % 3 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";

        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }

    }
}
