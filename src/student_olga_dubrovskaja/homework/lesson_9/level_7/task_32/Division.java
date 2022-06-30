package student_olga_dubrovskaja.homework.lesson_9.level_7.task_32;

class Division extends TwoArgumentMathOperation {

    public Division(MathOperation leftArgument,
                       MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() / calculateRightSide();
    }
}