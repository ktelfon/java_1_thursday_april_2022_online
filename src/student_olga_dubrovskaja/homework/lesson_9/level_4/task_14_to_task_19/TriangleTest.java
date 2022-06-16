package student_olga_dubrovskaja.homework.lesson_9.level_4.task_14_to_task_19;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.testTriangleArea();
        test.testTriangleCircumference();

    }


    public void testTriangleArea() {
        Triangle triangle = new Triangle(4);
        double expectedResult = 6.92;
        System.out.println(triangle.calculateArea());
        checkResult(expectedResult == triangle.calculateArea(), "triangle calculate area test: ");
    }

    public void testTriangleCircumference() {
        Triangle triangle = new Triangle(4);
        double expectedResult = 12;
        System.out.println(triangle.calculateCircumference());
        checkResult(expectedResult == triangle.calculateCircumference(), "Triangle calculate circumference test: ");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
