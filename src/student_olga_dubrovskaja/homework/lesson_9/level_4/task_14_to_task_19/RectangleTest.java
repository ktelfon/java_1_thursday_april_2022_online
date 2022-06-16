package student_olga_dubrovskaja.homework.lesson_9.level_4.task_14_to_task_19;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.testRectangleArea();
        test.testRectangleCircumference();

    }


    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(2, 6);
        double expectedResult = 12;
        System.out.println(rectangle.calculateArea());
        checkResult(expectedResult == rectangle.calculateArea(), "Rectangle calculate area test: ");
    }

    public void testRectangleCircumference() {
        Rectangle rectangle = new Rectangle(2, 8);
        double expectedResult = 20;
        System.out.println(rectangle.calculateCircumference());
        checkResult(expectedResult == rectangle.calculateCircumference(), "Rectangle calculate circumference test: ");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
