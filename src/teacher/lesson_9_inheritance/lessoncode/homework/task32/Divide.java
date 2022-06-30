package teacher.lesson_9_inheritance.lessoncode.homework.task32;

public class Divide extends TwoArgumentMathOperation {

    public Divide(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() / calculateRightSide();
    }
}
