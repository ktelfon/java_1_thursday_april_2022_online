package student_Vladislavs_Solims.homework.lesson_9.level_4_and_5;

public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.testCalculateArea();
        shapeUtilTest.testCalculatePerimeters();


    }

    void testCalculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(4, 4);
        shapes[3] = new Triangle(4, 4, 4);
        double expectedResult = 90;
        System.out.println(expectedResult);
        System.out.println(shapeUtil.calculateArea(shapes));
        checkResult(expectedResult == shapeUtil.calculateArea(shapes), "Calculate Area test : ");
    }

    void testCalculatePerimeters() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(4, 4);
        shapes[3] = new Triangle(4, 4, 4);
        double expectedResult = Math.round(25.13 + 16 + 16 + 12);
        System.out.println(expectedResult);
        System.out.println(shapeUtil.calculatePerimeters(shapes));
        checkResult(expectedResult == shapeUtil.calculatePerimeters(shapes), "CalculatePerimeters test : ");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }


}
