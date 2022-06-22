package teacher.lesson_7_encapsulation.lessoncode.homework;

public class PowerCalculator {

    public double power(double number, double power) {
        double result = number;
        for (int i = 1; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
