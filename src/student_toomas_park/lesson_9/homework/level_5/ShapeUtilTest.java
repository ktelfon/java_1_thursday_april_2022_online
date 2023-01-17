package student_toomas_park.lesson_9.homework.level_5;


public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil("");
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 4);
        shapes[1] = new Square("Square", 4);
        shapes[2] = new Rectangle("Rectangle",4, 4);
        shapes[3] = new Triangle("Triangle",4);
        System.out.println("Area sum of all shapes : " + shapeUtil.calculateArea(shapes));
        System.out.println("Perimeter sum of all shapes : " + shapeUtil.calculatePerimeter(shapes));

    }
}
