package student_olga_dubrovskaja.homework.lesson_9.level_5.task_20_to_task_28;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circleCircumference = shapeUtil.calculateCircumference(circle);
        System.out.println("Circle area: " + circleArea);
        System.out.println("Circle circumference: " + circleCircumference);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squareCircumference = shapeUtil.calculateCircumference(square);
        System.out.println("square area: " + squareArea);
        System.out.println("square circumference: " + squareCircumference);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectangleCircumference = shapeUtil.calculateCircumference(rectangle);
        System.out.println("rectangle area: " + rectangleArea);
        System.out.println("rectangle circumference: " + rectangleCircumference);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double triangleCircumference = shapeUtil.calculateCircumference(triangle);
        System.out.println("triangle area: " + triangleArea);
        System.out.println("triangle circumference: " + triangleCircumference);
    }
}
