package teacher.lesson_9_inheritance.lessoncode.homework.task32;

abstract class TwoArgumentMathOperation extends MathOperation {

	private MathOperation leftArgument;
	private MathOperation rightArgument;

	public TwoArgumentMathOperation(MathOperation leftArgument,
									MathOperation rightArgument) {
		this.leftArgument = leftArgument;
		this.rightArgument = rightArgument;
	}

	protected double calculateLeftSide() {
		return leftArgument.calculate();
	}

	protected double calculateRightSide() {
		return rightArgument.calculate();
	}

}
