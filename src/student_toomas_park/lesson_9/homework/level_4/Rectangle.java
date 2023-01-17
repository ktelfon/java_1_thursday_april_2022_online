package student_toomas_park.lesson_9.homework.level_4;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    Rectangle (String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double calculateArea() {
        return sideA * sideB;
    }

    double calculatePerimeter() {
        return sideA + sideA + sideB + sideB;
    }
}
