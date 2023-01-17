package student_toomas_park.lesson_9.homework.level_5;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(String title) {
        super(title);
    }

    Rectangle (String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    double calculateArea() {
        return sideA * sideB;
    }

    double calculatePerimeter() {
        return sideA + sideA + sideB + sideB;
    }

}
