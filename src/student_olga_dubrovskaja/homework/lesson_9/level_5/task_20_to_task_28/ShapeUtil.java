package student_olga_dubrovskaja.homework.lesson_9.level_5.task_20_to_task_28;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        return new Circle(generateRandomNumber());
    }

    Square createRandomSquare() {
        return new Square(generateRandomNumber());
    }

    Rectangle createRandomRectangle() {
        return new Rectangle(generateRandomNumber(), generateRandomNumber());
    }

    Triangle createRandomTriangle() {
        return new Triangle(generateRandomNumber());
    }

    double generateRandomNumber() {
        Random rand = new Random();
        return rand.nextDouble(1, 100);
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
        double sumOfAreas = 0;
        for (Shape shape : shapes) {
            sumOfAreas += shape.calculateArea();
        }
        return Math.round(sumOfAreas * 100.0) / 100.0;
    }

    double calculateCircumference(Shape[] shapes) {
        double sumOfCircumferences = 0;
        for (Shape shape : shapes) {
            sumOfCircumferences += shape.calculateCircumference();
        }
        return Math.round(sumOfCircumferences * 100.0) / 100.0;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculateCircumference(Shape shape) {
        return shape.calculateCircumference();
    }

}
