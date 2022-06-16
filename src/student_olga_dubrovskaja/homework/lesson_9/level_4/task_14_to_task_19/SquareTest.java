package student_olga_dubrovskaja.homework.lesson_9.level_4.task_14_to_task_19;

public class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.testSquareCircumference();
        test.testSquareArea();

    }

    public void testSquareArea() {
        Square square = new Square(2);
        double expectedResult = 4;
        System.out.println(square.calculateArea());
        checkResult(expectedResult == square.calculateArea(), "Square calculate area test: ");
    }

    public void testSquareCircumference() {
        Square square = new Square(4);
        double expectedResult = 16;
        System.out.println(square.calculateCircumference());
        checkResult(expectedResult == square.calculateCircumference(), "Square calculate circumference test: ");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
