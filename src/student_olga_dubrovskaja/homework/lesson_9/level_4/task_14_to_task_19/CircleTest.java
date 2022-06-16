package student_olga_dubrovskaja.homework.lesson_9.level_4.task_14_to_task_19;

class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.testCircleArea();
        test.testCircleCircumference();

    }

    public void testCircleArea() {
        Circle circle = new Circle(4);
        double expectedResult = 50.27;
        System.out.println(circle.calculateArea());
        checkResult(expectedResult == circle.calculateArea(), "Circle calculate area test: ");
    }

    public void testCircleCircumference() {
        Circle circle = new Circle(4);
        double expectedResult = 25.13;
        System.out.println(circle.calculateCircumference());
        checkResult(expectedResult == circle.calculateCircumference(), "Circle calculate circumference test: ");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
