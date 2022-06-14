package student_olga_dubrovskaja.homework.lesson_7.level_5.task_9;

class PowerCalculator {
    public double raiseToThePowerOf(int numberToRaise, int power){
        double result = numberToRaise;
        if(power > 0) {
            for (int i = 1; i < power; i++) {
                result = result * numberToRaise;
            }
        } else if (power < 0){
            for (int i = 1; i < Math.abs(power); i++) {
                result = result * numberToRaise;
            }
            result = 1/result;
        } else {
            return 1;
        }
        return result;
    }
}
