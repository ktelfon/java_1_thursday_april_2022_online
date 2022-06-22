package student_igor_peresunko.homework.lesson_7.PowerCalculator;

public class PowerCalculator {
    public double power(double number , double power){
        double result = 0;
        for ( int i = 1; i<power; i++ ){
            result *= number;
        }
        return result;
    }
}