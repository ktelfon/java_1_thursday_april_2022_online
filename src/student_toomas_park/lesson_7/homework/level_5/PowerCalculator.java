package student_toomas_park.lesson_7.homework.level_5;

public class PowerCalculator {
    public int powerCalc(int number, int times){
        int result = number;
        for (int i = 1; i<times; i++){result = result*number;}
        return result;
    }
}
