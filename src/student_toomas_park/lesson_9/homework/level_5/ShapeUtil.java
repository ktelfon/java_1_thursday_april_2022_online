package student_toomas_park.lesson_9.homework.level_5;

import java.util.Random;

import static java.lang.Double.NaN;

public class ShapeUtil extends Shape {

    public ShapeUtil(String title) {
        super(title);
    }

    double calculateArea() {
        return 0;
    }

    double calculatePerimeter() {
        return 0;
    }

    Circle createRandomCircle() {
        Circle circle = new Circle("Circle");
        circle.setRadius(Math.random());
        return circle;
    }

    Square createRandomSquare() {
        Square square = new Square("Square");
        square.setSideA(Math.random());
        return square;
    }

    Rectangle createRandomRectangle() {
        Rectangle rectangle = new Rectangle("Rectangle");
        rectangle.setSideA(Math.random());
        rectangle.setSideB(Math.random());
        return rectangle;
    }

    Triangle createRandomTriangle() {
        Triangle triangle = new Triangle("Triangle");
        triangle.setSideA(Math.random());
        return triangle;
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    double calculateArea(Shape[] shapes) {
        double shapesAreaSum = 0;
        for (Shape shape : shapes) {
            shapesAreaSum += shape.calculateArea();
        }
        return shapesAreaSum;
    }

    double calculatePerimeter(Shape[] shapes) {
        double shapesPerimeterSum = 0;
        for (Shape shape : shapes) {
            shapesPerimeterSum += shape.calculatePerimeter();
        }
        return shapesPerimeterSum;}
}