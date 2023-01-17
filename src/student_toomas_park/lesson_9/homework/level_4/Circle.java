package student_toomas_park.lesson_9.homework.level_4;

public class Circle extends Shape {

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    double calculateArea() {
        return radius * radius * Math.PI;
    }

    double calculatePerimeter() {
        return (22*2*radius)/7;
    }

}