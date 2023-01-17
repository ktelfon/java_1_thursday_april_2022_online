package student_toomas_park.lesson_9.homework.level_5;

import static java.lang.Double.NaN;

public class Triangle extends Shape {
    private double sideA;

    public Triangle(String title) {
        super(title);
    }

    public Triangle(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    double calculateArea() {
        return  (Math.sqrt(3) / 4) * Math.pow(sideA, 2);
    }

    double calculatePerimeter() {
        return sideA * 3;
    }
}
