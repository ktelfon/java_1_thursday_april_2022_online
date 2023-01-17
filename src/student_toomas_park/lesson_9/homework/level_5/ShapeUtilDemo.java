package student_toomas_park.lesson_9.homework.level_5;

import student_Vladislavs_Solims.class_exersizes.lesson_2.Random;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        circle();
        square();
        rectangle();
        triangle();
        random();
    }

    private static void random() {
        ShapeUtil shapeUtil = new ShapeUtil("");
        Shape randomShape = shapeUtil.createRandomShape();
        System.out.println("Random shape perimeter : " + randomShape.calculatePerimeter());
        System.out.println("Random shape area : " + randomShape.calculateArea());
    }

    private static void triangle() {
        ShapeUtil shapeUtil = new ShapeUtil("Triangle");
        Shape triangle = shapeUtil.createRandomTriangle();
        System.out.println("Triangle perimeter : " + shapeUtil.calculatePerimeter(triangle));
        System.out.println("Triangle area : " + shapeUtil.calculateArea(triangle));
    }

    private static void rectangle() {
        ShapeUtil shapeUtil = new ShapeUtil("Rectangle");
        Shape rectangle = shapeUtil.createRandomRectangle();
        System.out.println("Rectangle perimeter : " + shapeUtil.calculatePerimeter(rectangle));
        System.out.println("Rectangle area : " + shapeUtil.calculateArea(rectangle));
    }

    private static void square() {
        ShapeUtil shapeUtil = new ShapeUtil("Square");
        Shape square = shapeUtil.createRandomSquare();
        System.out.println("Square perimeter : " + shapeUtil.calculatePerimeter(square));
        System.out.println("Square area : " + shapeUtil.calculateArea(square));
    }

    private static void circle() {
        ShapeUtil shapeUtil = new ShapeUtil("");
        Shape circle = shapeUtil.createRandomCircle();
        System.out.println("Circle perimeter : " + shapeUtil.calculatePerimeter(circle));
        System.out.println("Circle area : " + shapeUtil.calculateArea(circle));
    }
}
