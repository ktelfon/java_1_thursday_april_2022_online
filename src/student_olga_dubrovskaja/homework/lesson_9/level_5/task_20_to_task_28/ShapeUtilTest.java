package student_olga_dubrovskaja.homework.lesson_9.level_5.task_20_to_task_28;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.testCalculateArea();
        test.testCalculateCircumference();

    }

    void testCalculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(4, 4);
        shapes[3] = new Triangle(4);
        double expectedResult = Math.round((50.27 + 16 + 16 + 6.92) * 100.0) / 100.0;
        System.out.println(expectedResult);
        System.out.println(shapeUtil.calculateArea(shapes));
        checkResult(expectedResult == shapeUtil.calculateArea(shapes), " Calculate Area test: ");
    }

    void testCalculateCircumference() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(4, 4);
        shapes[3] = new Triangle(4);
        double expectedResult = Math.round((25.13 + 16 + 16 + 12) * 100.0) / 100.0;
        System.out.println(expectedResult);
        System.out.println(shapeUtil.calculateCircumference(shapes));
        checkResult(expectedResult == shapeUtil.calculateCircumference(shapes), " Calculate Circumference test: ");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
