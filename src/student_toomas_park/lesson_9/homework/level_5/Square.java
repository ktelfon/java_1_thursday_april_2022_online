package student_toomas_park.lesson_9.homework.level_5;

public class Square extends Shape {
    private double sideA;

    public Square(String title) {
        super(title);
    }

    Square(String title, double sideA) {
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
        return sideA * sideA;
    }
    double calculatePerimeter() {
        return sideA * 4;
    }

}
