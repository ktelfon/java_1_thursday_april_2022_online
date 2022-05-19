package student_artemijs_talamajevs.lesson_3.level_7;

public class Circle {
    private double  radius;

    double calculateArea(double radius){
        return Math.PI * radius * radius;

    }
    public double getRadius(){
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
