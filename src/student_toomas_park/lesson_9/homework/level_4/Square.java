package student_toomas_park.lesson_9.homework.level_4;

public class Square extends Shape {

    private double sideA;

    Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }
    double calculateArea() {
        return sideA * sideA;
    }
    double calculatePerimeter() {
        return sideA * 4;
    }
}
