package student_toomas_park.lesson_9.homework.level_4;

public class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculatingArea() {
        return radius * radius * Math.PI;
    }

    double calculatingPerimeter() {
        return (22*2*radius)/7;
    }

}