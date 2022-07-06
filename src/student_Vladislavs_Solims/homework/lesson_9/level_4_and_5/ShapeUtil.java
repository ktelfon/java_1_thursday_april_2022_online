package student_Vladislavs_Solims.homework.lesson_9.level_4_and_5;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        return new Circle(fillWithRandomNumber());
    }

    Square createRandomSquare() {
        return new Square(fillWithRandomNumber());
    }

    Rectangle createRandomRectangle() {
        return new Rectangle(fillWithRandomNumber(), fillWithRandomNumber());
    }

    Triangle createRandomTriangle() {
        return new Triangle(fillWithRandomNumber(), fillWithRandomNumber(), fillWithRandomNumber());
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

    double calculateArea(Shape[] shapes) {
        double sumOfArea = 0;
        for (Shape shape : shapes) {
            sumOfArea += shape.calculateArea();
        }
        return Math.round(sumOfArea);
    }

    double calculatePerimeters(Shape[] shapes) {
        double sumOfCircumferences = 0;
        for (Shape shape : shapes) {
            sumOfCircumferences += shape.calculaatePerimetr();
        }
        return Math.round(sumOfCircumferences);

    }
    double calculateArea(Shape shape){
        return  shape.calculateArea();
    }
    double calculatePerimetr(Shape shape){
        return shape.calculaatePerimetr();
    }

    public double fillWithRandomNumber() {
        Random rnd = new Random();
        double randomNumber = rnd.nextDouble(1.0, 50.0);
        return randomNumber;
    }

}
