package student_Vladislavs_Solims.homework.lesson_9.level_4_and_5;

public class ShapeUtilDemo {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimetr = shapeUtil.calculatePerimetr(circle);
        System.out.println("Circle area: " + circleArea);
        System.out.println("Circle Perimetr : " + circlePerimetr);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimetr = shapeUtil.calculatePerimetr(square);
        System.out.println("Square area: " + squareArea);
        System.out.println("Square Perimetr : " + squarePerimetr);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double crectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimetr = shapeUtil.calculatePerimetr(rectangle);
        System.out.println("rectangle area: " + circleArea);
        System.out.println("rectangle Perimetr : " + circlePerimetr);

        Shape triangle = shapeUtil.createRandomRectangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimetr = shapeUtil.calculatePerimetr(triangle);
        System.out.println("triangle area: " + triangleArea);
        System.out.println("triangle Perimetr : " + trianglePerimetr);
    }
}
